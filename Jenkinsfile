@Library('gradle-lib') _

pipeline {
    agent any
    stages {
        stage('Run Gradle Shared Lib') {
            steps {
                gradleBuild()
            }
        }
    }
}
