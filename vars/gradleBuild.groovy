def call() {
    stage('Build') {
        sh './gradlew build'
    }
}
