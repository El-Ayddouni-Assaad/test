pipeline {

    agent any

    stages {

        stage("run file"){
            when{
                expression{
                    BRANCH_NAME == 'main'
                }
            }
            steps {
                
                echo 'building the application'
                nodejs('NodeJS'){
                    sh 'node server.js'
                }
                echo ' the application built'
            }
        }
       
    }
}