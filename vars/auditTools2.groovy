def call(Map config) {
    node {
      bat 'echo %config.message%'
      bat '''
        java -version
        mvn -version
      '''
    }
}
