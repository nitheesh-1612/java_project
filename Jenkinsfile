pipeline {
  agents any
  tools{
    maven 'Maven'
  }
  stages {
    stage ('Build'){
      steps{
        sh 'mvn clean package'
      }
      
      post{
        success{
        echo "build is success"
        }
      }
      
    }
    stage ('Deploy to tomcat server') {
      steps{
        deploy adapters: [tomcat9(credentialsId: '19f47c16-98f9-4f92-a0d6-004bb9ee6290', path: '', url: 'http://localhost:8070/')], contextPath: null, war: '**/*.war'
      }
    }
    
  }
  
}
