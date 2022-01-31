pipeline{
  agent any

  stages {
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
