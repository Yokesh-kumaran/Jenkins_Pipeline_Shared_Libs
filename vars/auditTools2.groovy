def call(Map config) {
    node {
      bat "${config.message}"
     // bat '''
       // java -version
       // mvn -version
     // '''
    }
}
