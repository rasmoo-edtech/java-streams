package exercises.intermediateOperations;

import mock.Mock;

// Utilizando a operação intermediária 'LIMIT', desenvolva as soluções para:
public class Limit {

    // 1) Retornar uma lista com os 2 primeiros pedidos que possuem maior valor total
    public static void exercise1() {
        var orders = Mock.orders();

        var result = orders;

        System.out.println(result);
    }

    // 2) Retornar uma lista com os 3 primeiros clientes que mais possuem itens no pedido
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
