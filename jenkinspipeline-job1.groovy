@Library('folder_shared_lib') _

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                log2 = new Log2()
                script {
                log2.info("hello info")
                log2.warn("hello warn")
                log2.error("hello error")

                }
            }
        }
    }
}
