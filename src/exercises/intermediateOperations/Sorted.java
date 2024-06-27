package exercises.intermediateOperations;

import mock.Mock;

// Utilizando a operação intermediária 'SORTED', desenvolva as soluções para:
public class Sorted {

    // 1) Retornar uma lista contendo os nomes de todos os clientes em ordem alfabética
    public static void exercise1() {
        var clients = Mock.clients();

        var result = clients;

        System.out.println(result);
    }

    // 2) Retornar uma lista de produtos ordenados pelo preço de forma decrescente
    public static void exercise2() {
        var products = Mock.products();

        var result = products;

        System.out.println(result);
    }

    // 3) Retornar uma lista contendo todos os itens referente ao pedido feito pela cliente 'Ana'.
    //    Os itens devem estar ordenados de forma crescente pelo preço
    public static void exercise3() {
        var orders = Mock.orders();

        var result = orders;

        System.out.println(result);
    }

    public static void main(String[] args) {
        exercise1();
//        exercise2();
//        exercise3();
    }

}
