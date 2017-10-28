pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'gradle build'
      }
    }
    stage('Building Client') {
      steps {
        sh 'yarn install'
      }
    }
    stage('Deploy') {
      parallel {
        stage('Deploy War') {
          steps {
            pwd(tmp: true)
            sh 'pwd'
          }
        }
        stage('Deploy Web Resources') {
          steps {
            sh 'mkdir ~/tomcat/webapp/www && cp build/www ~/tomcat/webapp/www && echo "Copied Web Resources Successfully"'
          }
        }
      }
    }
  }
}