fun main() {
    val distance = 100 // distância entre Ribeirão Preto e Franca
    val carSpeed = 110 // velocidade do carro em km/h
    val truckSpeed = 80 // velocidade do caminhão em km/h
    val time = distance / (carSpeed + truckSpeed) // tempo para os veículos se encontrarem
    val carDistance = carSpeed * time // distância percorrida pelo carro até o ponto de encontro
    val truckDistance = truckSpeed * time // distância percorrida pelo caminhão até o ponto de encontro

    if (carDistance < truckDistance) {
        println("O carro está mais próximo de Ribeirão Preto.")
    } else if (carDistance > truckDistance) {
        println("O caminhão está mais próximo de Ribeirão Preto.")
    } else {
        println("O carro e o caminhão estão na mesma distância de Ribeirão Preto.")
    }
}

/*
Explicação:

Nesse código, o tempo para os veículos se encontrarem é calculado dividindo a distância total pelo somatório das velocidades do carro e do caminhão.
Em seguida, a distância percorrida por cada veículo até o ponto de encontro é calculada multiplicando sua velocidade pelo tempo necessário para alcançar o ponto de encontro.
Por fim, a distância percorrida pelo carro e pelo caminhão é comparada para determinar qual está mais próximo da cidade de Ribeirão Preto no momento do encontro.
Nesse caso, a resposta correta é que ambos estão na mesma distância.

 */