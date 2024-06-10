pipeline {
    agent any
    tools {
        jdk 'default'
        maven 'default'
    }

    parameters {
            string(name: 'BRANCH', defaultValue: 'main', description: 'the branch of the repository to build')
        }

    environment {
            BUILD_NUMBER = "${env.BUILD_NUMBER}"
        }

    stages {
        stage('Checkout') {
            steps {
                git branch: "${params.BRANCH}", url: 'https://github.com/AlexNeutrino/myenkinslab.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building ${env.BUILD_NUMBER}...'
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