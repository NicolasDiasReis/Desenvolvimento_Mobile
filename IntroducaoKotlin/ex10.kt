fun calcularValorEmReais() {
    print("Digite seu saldo:")
    val saldo = readLine()!!.toDouble()
    println("A cotação atual é: ${saldo * 3.45}")
}
fun main(){
    calcularValorEmReais()
}