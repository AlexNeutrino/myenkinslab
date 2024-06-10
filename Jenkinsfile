pipeline {
    agent any
    tools {
        jdk 'Default'
        maven 'Default'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/AlexNeutrino/myenkinslab.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Archive') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}