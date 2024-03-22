def call(Map config) {
    node {
      echo "%config.message%"
     // bat '''
       // java -version
       // mvn -version
     // '''
    }
}
