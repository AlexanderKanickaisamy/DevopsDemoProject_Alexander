variable "key_name" {
  default = "terraform-key-pair"
}

variable "pvt_key_name" {
  default = "/tmp/mozilla_labuser0/terraform-key-pair.pem"
}


variable "sg_id" {
  default = "sg-0ae75bebd1b5680ec"
}


variable "ami_id" {
  default = "ami-05803413c51f242b7"
}


variable "region" {
  default = "us-east-2"
}

