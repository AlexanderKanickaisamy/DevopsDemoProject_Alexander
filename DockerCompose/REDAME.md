```
 362  cd 00-Setup/
  363  ls
  364  ./dockercompose-install.sh
  365  docker-compose version
  366  ls
  367  cd ..
  368  ls
  369  vim 01-Nginx
  370  mkdir 01-Nginx
  371  ls
  372  cd 01-Nginx/
  373  ls
  374  vim docker-compose.yaml
  375  ls
  376  docker-compose up -d
  377  docker ps
  378  docker-compose ps
  379  ls
  380  cd ..
  381  ls
```

```
398  cd 02-Multi-App/
  399  ls
  400  vim docker-compose.yaml
  401  docker images
  402  vim docker-compose.yaml
  403  docker images
  404  vim docker-compose.yaml
  405  ls
  406  docker ps
  407  cd ..
  408  ls
  409  cd 01-Nginx/
  410  ls
  411  docker-compose ps
  412  docker-compose stop
  413  docker-compose rm
  414  ls
  415  cd ../
  416  ls
  417  cd 02-Multi-App/
  418  ls
  419  docker-compose up -d
  420  docker-compose ps
  421  docker-compose stop
  422  docker-compose rm
  423  ls
```

```
430  ls
  431  mkdir 03-Petclinic-Deploy
  432  ls
  433  cd 03-Petclinic-Deploy/
  434  ls
  435  cp -rf ../../04-Docker/01-Dockerfile/tomcat/Dockerfile .
  436  ls
  437  cp -rf /root/.jenkins/workspace/Petclinic-Pipeline-as-code/03-App-Code/petclinic-code/target/petclinic.war .
  438  ls
  439  du -sh *
  440  ls
  441  vim docker-compose.yaml
  442  ls
  443  docker-compose up -d --build
  444  docker-compose ps
  445  docker-compose stop
  446  docker-compose rm
  447  ls
  448  > petclinic.war
  449  du -sh *
  450  cd ..
  451  ls
```
