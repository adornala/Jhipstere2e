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
        sh 'yarn build'
      }
    }
    stage('Deploy') {
      parallel {
        stage('Deploy War') {
          steps {
            pwd(tmp: true)
            sh '''current_dir=$(pwd)
cp $current_dir/build/libs/*.war ~/tomcat/webapps/'''
          }
        }
        stage('Deploy Web Resources') {
          steps {
            sh '''current_dir=$(pwd)
cd ~/tomcat/webapps
rm -Rf www
mkdir www
cp -R $current_dir/build/www ~/tomcat/webapps/www
echo "Copied Web Resources Successfully"'''
          }
        }
      }
    }
  }
}