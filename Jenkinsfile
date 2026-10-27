pipeline {

   agent any
   stages{
      stage('Checkout'){
         steps {
            checkout scm
         }
       }
       stage('build and test'){
           steps{
             bat '"C:\\apache-maven-3.10.0-bin\\apache-maven-3.10.0\\bin\\mvn.cmd" clean verify'
        }
      }
     stage('package'){
        steps{
           bat '"C:\\apache-maven-3.10.0-bin\\apache-maven-3.10.0\\bin\\mvn.cmd" package'
           }

          }

}
post {
   always{
      junit 'target/surefire-reports/*.xml'
    }

   success {
      archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
}
}
}