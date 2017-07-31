pipeline {
  agent { docker 'maven:3.3.3' }
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
    stage('post') {
      steps {
        archiveArtifacts '**/target/**/*.war'
      }
    }
  }
}
