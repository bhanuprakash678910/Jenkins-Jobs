node('slave') {
    stage('SHELL'){
        sh 'hostname'
    }
}
