import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente, agencia;
        float saldo;
        int numero;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Informe seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Saldo:");
        saldo = scanner.nextFloat();

        System.out.println("Número da Conta:");
        numero = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.\nSua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
