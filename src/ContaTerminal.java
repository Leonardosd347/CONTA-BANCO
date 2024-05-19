import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Por favor, digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o seu Saldo: ");
        String saldo = scanner.nextLine();

        String mensagem = "Olá ".concat(nomeCliente)
                                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                                .concat(agencia)
                                .concat(", conta ")
                                .concat(numeroConta)
                                .concat(" e seu saldo ")
                                .concat(saldo)
                                .concat(" já está disponível para saque.");


        System.out.println(mensagem);

        scanner.close();
    }
}
