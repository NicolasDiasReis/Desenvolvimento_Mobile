fun calcularNovoSalario() {
    print("Digite o valor do salário de um funcionario: ")
    val salarioFun = readln()!!.toDouble()
    val novoSal = salarioFun + (salarioFun * 0.15)

    println("O salário do funcionário é de $salarioFun, com o aumento ficou $novoSal")
}
fun main(){
    calcularNovoSalario()
}