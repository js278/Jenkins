def call(Map config = [:]) {
    sh "echo ${config.count}. 1"
    for(x = 1; x < 5; x++){
        sh "echo ${config.count}"
    }
}
