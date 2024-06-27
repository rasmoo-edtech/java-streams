package exercises.intermediateOperations;

import mock.Mock;

// Utilizando a operação intermediária 'DISTINCT', desenvolva as soluções para:
public class Distinct {

    // 1) Retornar uma lista de todos os clientes únicos com base no nome
    public static void exercise1() {
        var clients = Mock.clients();

        var result = clients;

        System.out.println(result);
    }

    // 2) Retornar uma lista contendo os nomes únicos dos produtos que foram adicionados nos pedidos
    public static void exercise2() {
        var orders = Mock.orders();

        var result = orders;

        System.out.println(result);
    }

    public static void main(String[] args) {
        exercise1();
//        exercise2();
    }

}
