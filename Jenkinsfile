pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'gradle build'
      }
    }
    stage('Deploy') {
      steps {
        sh 'echo "Run Build"'
      }
    }
  }
}