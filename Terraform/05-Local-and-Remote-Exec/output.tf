output "PublicIP" {
  value = aws_instance.backend.public_ip
}
