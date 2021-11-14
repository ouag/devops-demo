@Library('folder_shared_lib') _

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                log()
            }
        }
    }
}
