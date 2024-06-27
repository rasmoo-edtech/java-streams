package mock;

import entity.Client;
import entity.Order;
import entity.OrderItem;
import entity.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Mock {

    private Mock() {
    }

    public static List<Client> clients() {
        return Arrays.asList(
                new Client("Pedro", LocalDate.of(1964, 1, 7)),
                new Client("Pedro", LocalDate.of(1992, 8, 28)),
                new Client("Ana", LocalDate.of(1993, 4, 1)),
                new Client("Marcos", LocalDate.of(1988, 3, 15)),
                new Client("Vanessa", LocalDate.of(1990, 8, 25)),
                new Client("Marcia", LocalDate.of(1963, 8, 9)),
                new Client("Mateus", LocalDate.of(1997, 6, 18)),
                new Client("Cristina", LocalDate.of(1964, 5, 12)),
                new Client("Leonardo", LocalDate.of(1998, 10, 27)),
                new Client("Larissa", LocalDate.of(1998, 9, 7)),
                new Client("Larissa", LocalDate.of(1991, 12, 17)),
                new Client("Marcelo", LocalDate.of(1998, 4, 11))
        );
    }

    public static List<Product> products() {
        return Arrays.asList(
                new Product("Iphone 15", 4899d),
                new Product("Airpods Pro 2", 1799.99),
                new Product("Macbook Pro", 15699.99),
                new Product("Galaxy S24", 4799d),
                new Product("Dell Inspiron", 3329d),
                new Product("Elements Lunari", 2797.10),
                new Product("Elements Magna", 2199.50),
                new Product("Nintendo Switch OLED", 2299.90),
                new Product("Headset Gamer Astro A50", 1399.99),
                new Product("Headset Gamer Redragon Hero", 199.90),
                new Product("Headset Gamer HyperX Cloud Stinger 2", 239.99),
                new Product("Teclado Redragon Kumara Pro", 295.11),
                new Product("Teclado Logitech MX Keys Mini", 639.99),
                new Product("Teclado HyperX Allow MKW100", 2699.99),
                new Product("Quest 2", 1824.27),
                new Product("Meta Quest 3", 4405.05),
                new Product("Elements Magna", 2199.50),
                new Product("Epson Powerlite E20 ", 3149d),
                new Product("Samsung The Freestyle 2", 3656.46),
                new Product("Echo Show 15", 1749.99)
        );
    }

    public static List<Order> orders() {
        var products = products();
        var random = new Random();

        return clients().stream()
                .map(client -> {
                    Collections.shuffle(products);

                    var items = products.stream()
                            .limit(random.nextInt(1, products().size()))
                            .map(product -> new OrderItem(product, random.nextInt(1, 5)))
                            .collect(Collectors.toList());

                    return new Order(client, items);
                })
                .collect(Collectors.toList());
    }

}
