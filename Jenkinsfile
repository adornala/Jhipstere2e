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
    stage('Deploy War') {
      steps {
        sh '''cp build/lib/*.war ~/tomcat/webapp/
echo "Copied War to Tomcat"
mkdir ~/tomcat/webapp/www
cp build/www ~/tomcat/webapp/www
echo "Copied Web Resources Successfully"'''
      }
    }
  }
}