import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {

                System.out.println("******************");
                System.out.println("Qual a temperatura original?");
                System.out.println("1. Celcius");
                System.out.println("2. Fahrenheit");
                System.out.println("3. Kelvin");
                System.out.println("4. Sair");
                System.out.println("******************");
                System.out.println("Digite a opção (1 a 4): ");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao > 4 || opcao < 1) {
                    System.out.println("Opcao invalida.");

                }

                System.out.print("Digite a temperatura: ");
                double temperatura = scanner.nextDouble();

                switch (opcao) {
                    case 1 -> {
                        Celsius celsius = new Celsius(temperatura);

                        System.out.println("=== convertendo ===");
                        System.out.println("Fahrenheit: " + celsius.paraKelvin());
                        System.out.println("Kelvin: " + celsius.paraKelvin());
                    }
                    case 2 -> {
                        Fahrenheit fahrenheit = new Fahrenheit(temperatura);
                        System.out.println("=== convertendo ===");
                        System.out.println("Celsius: " + fahrenheit.paraCelsius());
                        System.out.println("Kelvin: " + fahrenheit.paraKelvin());
                    }
                    case 3 -> {
                        Kelvin kelvin = new Kelvin(temperatura);
                        System.out.println("=== Convertendo ===");
                        System.out.println("Celsius: " + kelvin.paraCelsius());
                        System.out.println("Fahrenheit: " + kelvin.paraFahrenheit());
                    }
                    case 4 -> {
                        System.out.println("saindo...");
                        return;
                    }
                    default -> {
                        System.out.println("Opcao invalida.");

                        continue;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Dados incorretos digitados");
        }
    }

}
