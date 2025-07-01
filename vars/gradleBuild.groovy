def call() {
    stage('Build') {
        sh './gradlew build'
    }
    stage('Test') {
        sh './gradlew test'
    }
}
