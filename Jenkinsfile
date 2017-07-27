pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        withEnv(["JAVA_HOME=${ tool 'jdk-1.8.0_64bits' }", "PATH+MAVEN=${tool 'maven-3.2.1'}/bin:${env.JAVA_HOME}/bin"]) {
          sh 'mvn clean install'
        }
      }
    }
  }
}
