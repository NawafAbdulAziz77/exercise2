@Library('gradle-lib') _

pipeline {
    agent any
    stages {
        stage('Build & Test') {
            steps {
                gradleBuild()
            }
        }
    }
}
