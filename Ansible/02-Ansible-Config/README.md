```
 1000  cd 06-Ansible/
 1001  ls
 1002  cp -rf 01-Inventory 02-Ansible-Config
 1003  ls
 1004  cd 02-Ansible-Config/
 1005  ls
 1006  mv inventory hosts
 1007  ls
 1008  vim ansible.cfg
 1009  ls
 1010  ansible 'web:&prod'  -m ping
 1011  la -ltr /var/log/ansible.log
 1012  cat  /var/log/ansible.log
 1013  ansible-doc apt
 1014  ansible 'web:&prod'  -m apt -a "name=ntp state=present"
 1015  ansible 'web:&prod'  -m apt -a "name=ntp state=present" -s
 1016  ansible 'web:&prod'  -m apt -a "name=ntp state=absent" -s
 1017  ls
 1018  vim ansible.cfg
 1019  cat /etc/ansible/ansible.cfg
 1020  vim ansible.cfg
 1021  ansible 'web:&prod'  -m apt -a "name=ntp state=present"
 1022  ls
```
