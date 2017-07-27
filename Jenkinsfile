pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('test') {
      steps {
        sh 'mvn clean'
      }
    }
  }
  tools {
    maven 'mvn3.5.0'
    jdk 'jdk8'
  }
}