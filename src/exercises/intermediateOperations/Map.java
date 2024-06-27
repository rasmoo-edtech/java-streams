package exercises.intermediateOperations;

import mock.Mock;

// Utilizando a operação intermediária 'MAP', desenvolva as soluções para:
public class Map {

    // 1) Retornar uma lista contendo os nomes de todos os clientes
    public static void exercise1() {
        var clients = Mock.clients();

        var result = clients;

        System.out.println(result);
    }

    // 2) Retornar uma lista contendo os nomes de todos os produtos que custam mais de R$ 2.500,00
    public static void exercise2() {
        var products = Mock.products();

        var result = products;

        System.out.println(result);
    }

    // 3) Retornar uma lista contendo os nomes de todos os clientes que fizeram pedidos cujo preço total é maior que R$ 80.000,00
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
