def call(Map config = [:]) {
    for(x = count < 5; x++){
        sh "echo ${config.count}"
    }
}
