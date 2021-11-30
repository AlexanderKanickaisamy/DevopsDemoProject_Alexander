```
 1200  cd 07-Roles/
 1201  ls
 1202  cat playbook.yaml
 1203  cat webserver.yaml
 1204  ls
 1205  cp -rf webserver.yaml tomact-role.yaml
 1206  ls
 1207  vim tomact-role.yaml
 1208  s
 1209  ls
 1210  rm -rf tomcat.yaml playbook.yaml
 1211  ls
 1212  mv tomact-role.yaml tomcat.yaml
 1213  ls
 1214  ansible-playbook tomcat.yaml
 1215  ls
 1216  ansible-playbook tomcat.yaml
 1217  vim roles/webserver/tasks/main.yml
 1218  ansible-playbook tomcat.yaml
 1219  ls
```
