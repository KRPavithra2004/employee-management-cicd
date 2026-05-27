pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/KRPavithra2004/employee-management-cicd.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t employee-system .'
            }
        }

    }
}