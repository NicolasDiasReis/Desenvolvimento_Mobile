fun main(){
    tempoVida()
}

fun tempoVida(){
    print("Quantos cigarros você fuma por dia? ")
    val cigarrosDia = readLine()!!.toInt()

    print("Por quantos anos você fumou cigarro? ")
    val anosFumo = readLine()!!.toInt()

    val minCigarro = 10
    val minAno = 365 * 24 * 60

    val minPerdidos = cigarrosDia * minCigarro * anosFumo * 365 // Minutos perdidos é a multiplicação de entre (cigarro * 10min * 365 dias do ano * Anos fumando)

    val diasPerdidos = minPerdidos / 1440 

    print("Você perdeu aproximadamente $diasPerdidos dias por conta do fumo.")
}