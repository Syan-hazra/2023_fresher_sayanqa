pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // This step will checkout your code from the GitHub repository
                // Replace '<your-github-repo>' with your actual GitHub repository URL
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/Syan-hazra/2023_fresher_sayanqa.git/']]])
            }
        }

        stage('Build') {
            steps {
                echo 'This is Build command stage'
               
                sh 'mvn clean'
            }
        }
       stage('Test') {
            steps {
                echo 'This is Test Command Stage'
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            // Clean up after the build, regardless of the result
            cleanWs()
        }
        success {
            // Actions to perform if the build is successful (e.g., notifications)
            echo 'Build successful! Tests passed!'
        }
        failure {
            // Actions to perform if the build fails (e.g., notifications)
            echo 'Build failed! Tests may have failed.'
        }
    }
}
