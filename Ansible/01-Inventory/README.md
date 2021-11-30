```
 924  mkdir 06-Ansible
  925  ls
  926  cd 06-Ansible/
  927  ls
  928  apt-get install ansible -y
  929  ls
  930  mkdir 01-Inventory
  931  ls
  932  cd 01-Inventory/
  933  ls
  934  vim inventory
  935  ls
  936  ping 172.31.0.100
  937  ping 172.31.0.101
  938  ls
  939  s
  940  ls
  941  ansible-doc  -l
  942  ls
  943  ansible all -i inventory -m ping -u vagrant -k
  944  ssh vagrant@172.31.0.100
  945  ls -ltr  /root/.ssh/
  946  ssh vagrant@172.31.0.100
  947  ls -ltr  /root/.ssh/
  948  ls -ltr  /root/.ssh/known_hosts
  949  cat  /root/.ssh/known_hosts
  950  ssh vagrant@172.31.0.101
  951  ls
  952  cat /root/.ssh/known_hosts
  953  ansible all -i inventory -m ping -u vagrant -k
  954  ls
  955  vim inventory
  956  ansible all -i inventory -m ping -u vagrant -k
  957  ls
  958  vim inventory
  959  ls
  960  ansible all -i inventory -m ping -u vagrant -k
  961  ansible web -i inventory -m ping -u vagrant -k
  962  ansible 172.31.0.100 -i inventory -m ping -u vagrant -k
  963  ansible 192.31.0.100 -i inventory -m ping -u vagrant -k
  964  ansible web -i inventory -m ping -u vagrant -k
  965  vim inventory
  966  ansible web -i inventory -m ping -u vagrant -k
  967  ansible web:db -i inventory -m ping -u vagrant -k
  968  vim inventory
  969  s
  970  ansible web:db -i inventory -m ping -u vagrant -k
  971  ansible web -i inventory -m ping -u vagrant -k
  972  ansible 'web:&prod' -i inventory -m ping -u vagrant -k
  973  ansible 'db:&prod' -i inventory -m ping -u vagrant -k
  974  ansible 'db:&stage' -i inventory -m ping -u vagrant -k
  975  ls
  976  vim inventory
  977  ansible 'web:&prod' -i inventory -m ping -u vagrant -k
  978  vim inventory
  979  ls
  980  ansible 'web:&prod' -i inventory -m ping -u vagrant -k
  981  ansible 'db:&prod' -i inventory -m ping -u vagrant -k
  982  ansible 'web:&prod:!python3' -i inventory -m ping -u vagrant -k
  983  ansible 'db:&prod:!python3' -i inventory -m ping -u vagrant -k
  984  vim inventory
  985  ansible 'dc' -i inventory -m ping -u vagrant -k
  986  ls
  987  vim inventory
  988  ls
  989  ansible 'dc' -i inventory -m ping
  990  ansible 'db:&prod:!python3' -i inventory -m ping
  991  ansible 'web:&prod:!python3' -i inventory -m ping
```
