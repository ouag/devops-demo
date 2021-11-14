@Library('folder_shared_lib') _

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                log.info("hello info")
                log.warn("hello warn")
                log.error("hello error")
                }
            }
        }
    }
}
