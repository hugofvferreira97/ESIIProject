pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'gradle wrapper build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'gradle wrapper check'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}