pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                bat './gradlew check'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}