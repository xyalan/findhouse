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
  post {
    failure {
      mail to: 'houlong.yang@ele.me',
           subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
           body: "Something is wrong with ${env.BUILD_URL}"
    }
  }
}
