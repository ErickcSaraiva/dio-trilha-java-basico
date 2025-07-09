import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome Completo !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo da conta !");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

        System.out.println(mensagem);

        scanner.close();
    }
}

