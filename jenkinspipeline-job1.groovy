@Library('folder_shared_lib') _



pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {

                script {

                    Log.info("hello info")
                    Log.warn("hello warn")
                    Log.error("hello error")

                }
            }
        }
    }
}
