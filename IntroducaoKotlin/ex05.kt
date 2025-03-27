fun calcularMediaDeDoisValores() {
    print("Digite um valor: ")
    val n1 = readLine()!!.toDouble()  // Converte a entrada para inteiro
    print("Digite outro valor: ")
    val n2 = readLine()!!.toDouble()
    val media = (n1 + n2) / 2
    println("A média de ($n1 + $n2) / 2 é igual $media")
}
fun main(){
    calcularMediaDeDoisValores()
}