package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class Principal {

    public static void main(String[] args) {

        // Instanciação e atribuição correta via construtor
        Veiculos carros1 = new Veiculos("Carlos", "ABC-1234", 0.0);

        // Abastecendo o veículo de forma controlada
        carros1.adicionar(50.0);

        // Tentativa de gasto (o método na classe Veiculo deve barrar se não houver saldo suficiente)
       carros1.gasta(100.0);

        // Exibição dos dados utilizando os métodos getters
        System.out.println("Dono: " + carros1.getIndividuo() + " | Placa: " + carros1.getPlaca() + " | Gasolina: " + carros1.getAlcool());
    }
}