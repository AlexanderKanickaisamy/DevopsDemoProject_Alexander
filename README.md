# devops-mindtree-25-Nov-2021

node {
  
  stage('GIT CheckOut') {
    git 'https://github.com/amitvashisttech/mindtree-devops-27April2020.git'
  }

  def project_path = "02-Jenkins/Code/petclinic"
    dir(project_path) {

  stage('Maven-Clean') {
    sh label: '', script: 'mvn clean'
  }

  stage('Maven-Compile') {
    sh label: '', script: 'mvn compile'
  }
  
  stage('Maven-Test') {
    sh label: '', script: 'mvn test'
  }
  
  stage('Maven-Package') {
    sh label: '', script: 'mvn package'
  }
 }
}
