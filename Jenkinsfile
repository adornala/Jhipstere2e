pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'gradlew build'
      }
    }
    stage('Deploy') {
      steps {
        sh 'echo "Run Build"'
      }
    }
  }
}