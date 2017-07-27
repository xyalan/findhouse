pipeline {
  agent any
  tools {
    maven 'Maven 3.5.0'
    jdk 'jdk8'
  }
  stages {
    stage('build') {
      steps {
         sh 'mvn clean install'
      }
    }
  }
}
