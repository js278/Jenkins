def call(Map config = [:]) {
    for(x = count; x< 5; x++){
        sh "echo ${config.count}"
    }
}
