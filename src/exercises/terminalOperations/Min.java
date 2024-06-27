package exercises.terminalOperations;

import mock.Mock;

// Utilizando a operação terminal 'MIN', desenvolva as soluções para:
public class Min {

    // 1) Retornar o produto mais barato
    public static void exercise1() {
        var products = Mock.products();

        var result = products;

        System.out.println(result);
    }

    // 2) Retornar o cliente que possui a menor quantidade de letras no nome
    public static void exercise2() {
        var clients = Mock.clients();

        var result = clients;

        System.out.println(result);
    }

    // 3) Retornar o itemPedido mais barato, dentre todos os pedidos
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
