/*
O objetivo da atividade é implementar um sistema de gerenciamento de veículos.

Esboço:
1. Criação da classe base Veiculo, com propriedades: modelo, ano e preço.
2. Criação das subclasses Carro e Caminhao, com propriedades e comportamentos específicos.
3. Demonstração de polimorfismo ao manipular uma lista de veículos contendo tanto carros quanto caminhões.
4. Realização de typecasting para manipulação de objetos de tipos diferentes (Carro e Caminhao) e acessar propriedades específicas.
*/

// O código que os alunos devem implementar começa aqui

// --> Crie a classe base Veiculo com as propriedades modelo, ano e preço e mplemente o metodo mostrarDetalhes()
// --> use um bloco init para imprimir a frase "Veículo [nome_do_veiculo] do ano [ano] foi criado com sucesso!
/*
fun mostrarDetalhes() {
    println("Veiculo modelo: $modelo, Ano: $ano, Preço: $preco")
}
*/

// --> Crie a subclasse Carro com as propriedades modelo, ano, preco e numero de portas e implemente o metodo calcularImposto()
/*
open fun calcularImposto(): Double {
    return preco * 0.05
}
*/

// --> Crie a subclasse Caminhao com as propriedades modelo, ano, preco e capacidade de carga e implemente o metodo calcularImposto()
/*
open fun calcularImposto(): Double {
    return preco * 0.10
}
*/

// Função main
fun main() {
    val carro = Carro("Ferrari", 2020, 350000.0, 2)
    val caminhao = Caminhao("Scania", 2018, 450000.0, 20.0)
    val outroCarro = Carro("Gol", 2019, 50000.0, 4)

    val veiculos: List<Veiculo> = listOf(carro, caminhao, outroCarro)

    /*
    Use o polimorfismo iterando sobre a lista de veículos e exibir os detalhes de cada um
    e use typecasting para acessar propriedades específicas de cada tipo de veículo.
    */
}
