package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Product product = new Product(1);
            System.out.println("""
                Olá, seja bem vindo...\s
                'Promoção para você disponível.'
                Após as 20hrs todos produtos recebem 10% de desconto.\s
                Aos Sábados e Domingos o desconto vale o dia inteiro.
                Aproveite!!""");
            System.out.println("Digite o valor do produto:");
            double price = scanner.nextDouble();
            System.out.println("Digite o Dia da semana(Segunda a Domingo):");
            String dayOfWeek = scanner.next().toUpperCase();
            System.out.println("Digite apenas a Hora:");
            int hour = scanner.nextInt();
            System.out.println("Digite o minuto:");
            int min = scanner.nextInt();
            System.out.println("Digite o segundo:");
            int sec = scanner.nextInt();

            product.setPrice(price);
            product.getDayHour().setDayOfWeek(dayOfWeek);
            product.getDayHour().setHour(hour);
            product.getDayHour().setMin(min);
            product.getDayHour().setSec(sec);

            double finalPrice = product.CalculatePrice();

            System.out.println("O preço final do produto é: " + finalPrice);
        }
        catch (Exception e){
            System.out.println("Data typing error");
        }
        finally {
            System.out.println("Digite os dados corretamente!");
        }
    }
}
