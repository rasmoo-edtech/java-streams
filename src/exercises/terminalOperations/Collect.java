package exercises.terminalOperations;

import entity.Client;
import entity.Product;
import mock.Mock;

import java.util.stream.Collectors;

// Utilizando a operação terminal 'COLLECT', desenvolva as soluções para:
public class Collect {

    // 1) Filtrar todos os produtos que custam menos de R$ 500 e concatenar os nomes desses produtos em uma String
    public static void exercise1() {
        var products = Mock.products();

        var result = products.stream()
                .filter(product -> product.getPrice() < 500)
                .map(Product::getName)
                .collect(Collectors.joining(","));

        System.out.println(result);
    }

    // 2) Agrupar todos os clientes pelo mês de aniversário e também determinar quantos clientes fazem aniversário em cada mês
    public static void exercise2() {
        var clients = Mock.clients();

        var result = clients.stream()
                .collect(Collectors.groupingBy(client -> client.getBirthDate().getMonth(), Collectors.counting()));

        System.out.println(result);
    }

    // 3) Agrupar todos os clientes por idade e coletar os nomes em listas
    public static void exercise3() {
        var clients = Mock.clients();

        var result = clients.stream()
                .collect(Collectors.groupingBy(Client::getAge, Collectors.mapping(Client::getName, Collectors.toList())));

        System.out.println(result);
    }

    // 4) Agrupar todos os clientes por idade e coletar os nomes em uma string separados por ';'
    public static void exercise4() {
        var clients = Mock.clients();

        var result = clients.stream()
                .collect(Collectors.groupingBy(Client::getAge, Collectors.mapping(Client::getName, Collectors.joining(";"))));

        System.out.println(result);
    }

    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
        exercise4();
    }

}
