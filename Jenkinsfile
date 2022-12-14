pipeline {
  agents any
  
  stages {
    stage ('Build'){
      steps{
        sh 'mvn clean package'
      }
      
      post{
        echo "build is success"
      }
      
    }
    
    
  }
  
}
