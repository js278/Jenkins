def call(Map config = [:]) {
    loadLinuxScript(name: 'loop.sh')
    sh "./loop.sh ${config.count}"
}