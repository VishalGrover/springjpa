pipeline{
  agent any
  tools {
      maven "MAVEN"
      jdk "JDK"
  }
  stages {
      stage('Initialize'){
          steps{
              echo "PATH = ${M2_HOME}/bin:${PATH}"
              echo "M2_HOME = /opt/maven"
          }
      }
      stage("build"){
        steps{
         echo "building an application"
         sh 'mvn compile'
        }
      }
      stage("test"){
         steps{
          echo "Testing an application"
         }
      }
      stage("upload artifact"){
         steps{
          echo "Testing an application"
          sh 'mvn clean install -DskipTests'
         }
      }
      stage("deploy"){
         steps{
          echo "Deploying an application"
         }
      }

  }
}
