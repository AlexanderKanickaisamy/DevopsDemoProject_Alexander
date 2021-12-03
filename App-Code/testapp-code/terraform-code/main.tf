resource "aws_instance" "backend" {
  ami               = var.ami_id
  instance_type     = "t2.micro"
  key_name          = var.key_name
  vpc_security_group_ids = [var.sg_id]
  lifecycle {
    prevent_destroy = false
  }
  tags = {
    Name = "Dev-App"
  }

  connection { 
    type = "ssh"
    user = "ec2-user"
    private_key = file(var.pvt_key_name)
    host  = self.public_ip 
  }

  
  provisioner "remote-exec" {
    inline = [
      "sudo sleep 30",
      "sudo yum update -y",
      "sudo yum install python3 firewalld sshpass -y"
    ]

  }
}

resource "null_resource" "ansible-main" { 
  provisioner "local-exec" {
    command = <<EOT
       > jenkins-ci.ini;
       echo "[jenkins-ci]"|tee -a jenkins-ci.ini;
       export ANSIBLE_HOST_KEY_CHECKING=False;
       echo "${aws_instance.backend.public_ip}"|tee -a jenkins-ci.ini;
       ansible-playbook --key-file=${var.pvt_key_name} -i jenkins-ci.ini -e 'ansible_python_interpreter="/usr/bin/python3"' -u ec2-user ./ansible-code/playbook.yml -v 
     EOT
  }
  depends_on = [aws_instance.backend]
}




