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
  default = "ami-0ba62214afa52bec7"
}

variable "region" {
  default = "us-east-2"
}
