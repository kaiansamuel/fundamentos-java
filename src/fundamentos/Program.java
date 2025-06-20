package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite o nome do Produto: ");
        System.out.println("Name: ");
        product.nome = sc.nextLine();
        System.out.println("Price: ");
        product.preco = sc.nextDouble();
        System.out.println("Quantidade em estoque: ");
        product.quantidade = sc.nextInt();

        System.out.println(product);

        sc.close();
    }
}
