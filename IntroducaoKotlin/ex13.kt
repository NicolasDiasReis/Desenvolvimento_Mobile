fun calcularPrecoPromocional() {
    print("Digite o preço de um produto")
    val precoProduto = readLine()!!.toDouble()
    val valorPromo = precoProduto - (precoProduto * 0.05)

    println("O produto tem o preço original de $precoProduto e com o preço promocional fica $valorPromo")
}
fun main(){
    calcularPrecoPromocional()
}