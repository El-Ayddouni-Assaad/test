pipeline {

    agent any

    stages {

        stage("run file"){

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