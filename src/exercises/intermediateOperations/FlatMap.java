package exercises.intermediateOperations;

import mock.Mock;

// Utilizando a operação intermediária 'FLATMAP', desenvolva as soluções para:
public class FlatMap {

    // 1) Retornar uma lista contendo os nomes de todos os produtos solicitados pelo cliente de nome 'Ana'
    public static void exercise1() {
        var orders = Mock.orders();

        var result = orders;

        System.out.println(result);
    }

    public static void main(String[] args) {
        exercise1();
    }

}
