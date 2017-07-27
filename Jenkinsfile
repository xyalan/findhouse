pipeline {
  agent any
  tools {
    maven 'mvn3.5.0'
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
