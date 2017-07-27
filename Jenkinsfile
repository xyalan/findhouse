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
    stage('deploy') {
      steps {
        sh 'mvn package'
      }
    }
  }
  tools {
    maven 'mvn3.5.0'
    jdk 'jdk8'
  }
}