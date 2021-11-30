```
 1230  mkdir 07-Terraform
 1231  cd 07-Terraform/
 1232  ls
 1233  vim 00-Setup
 1234  mkdir 00-Setup
 1235  vim 00-Setup/terraform-bootstrap.sh
 1236  chmod +x 00-Setup/terraform-bootstrap.sh
 1237  ls
 1238  cd ..
 1239  ls
 1240  git add . ; git commit -m "07-Terraform" ; git push
 1241  ls
 1242  cd 07-Terraform/
 1243  ls
 1244  cd 00-Setup/
 1245  ls
 1246  ./terraform-bootstrap.sh
 1247  terraform --version
 1248  ls
 1249  cd ..
 1250  ls
 1251  mkdir 01-Setup-AWS-Account
 1252  cd 01-Setup-AWS-Account/
 1253  ls
 1254  vim README.md
 1255  ls
 1256  cat README.md
 1257  ls
 1258  cd ..
 1259  ls
 1260  git add . ; git commit -m "07-Terraform" ; git push
 1261  echo "export AWS_ACCESS_KEY_ID="XXXXXXXXXX" " >> .bashrc
 1262  echo "export AWS_SECRET_ACCESS_KEY="XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" " >>  .bashrc
 1263  cat /root/.bashrc
 1264  ls
 1265  ls -a .bashrc
 1266  cat .bashrc
 1267  cat .bashrc >> /root/.bashrc
 1268  rm -rf .bashrc
 1269  ls
 1270  cat /root/.bashrc
 1271  source /root/.bashrc
 1272  set | grep -i AWS
 1273  ls
 1274  mkdir 02-First-Deployment
 1275  s
 1276  ls
 1277  cd 02-First-Deployment/
 1278  ls
 1279  vim fisrt-deployment.tf
 1280  terraform init
 1281  terraform apply
 1282  terraform  show
 1283* terraform
 1284  terraform apply --auto-approve
 1285  terraform destroy --auto-approve
 1286  ks
 1287  ls
 1288  ls -a
 1289  ls -R .terraform/
 1290  ls
 1291  du -sh .terraform/
 1292  ls
 1293  cd ..
 1294  ls
 1295  cd ..
 1296  ls
 1297  ls -a
 1298  cat .gitignore
 1299  git add . ; git commit -m "07-Terraform" ; git push
```
