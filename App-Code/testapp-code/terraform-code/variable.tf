variable "key_name" {
  default = "terraform-key-pair"
}

variable "pvt_key_name" {
  default = "/root/.ssh/terraform-key-pair.pem"
}


variable "sg_id" {
  default = "sg-0ae75bebd1b5680ec"
}


variable "ami_id" {
  type = map

  default = {
    "us-east-1" = "ami-0ba62214afa52bec7"
    "us-west-1" = "ami-0ba62214afa52bec7"
  }
}

variable "instance_count" {
  default = "2"
}

variable "instance_tags" {
  type = list
  default = ["Terraform-1", "Terraform-2"]
}

variable "aws_region" {
  default = "us-east-2"
}

