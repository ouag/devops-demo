@Library('folder_shared_lib') _



pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {

                script {

                    Log2.info("hello info")
                    Log2.warn("hello warn")
                    Log2.error("hello error")

                }
            }
        }
    }
}
