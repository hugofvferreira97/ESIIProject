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
                sh 'graddle wrapper check'
            }
        }
        post {
            always {
                junit 'build/reports/**/*.xml'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}