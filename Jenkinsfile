pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git branch: 'main',
                url: 'https://github.com/KRPavithra2004/employee-management-cicd.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t employee-system .'
            }
        }

    }
}