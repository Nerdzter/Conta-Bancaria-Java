import java.util.Scanner; // importa Scanner, para ler dados

public class ContaTerminal {

        // Deixo como variaveis globais e privadas, para ser possivel chamar no codigo inteiro
         
    private static String nomeCliente;
    private static String agencia;
    private static int numeroConta;
    private static double saldo;

    public static void main(String[] args) {  // Chamo meus métodos para exibição

        criaConta();
        System.out.println(retornaMensagem());
    }

    public static void criaConta() {                  
        // Chamo Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados do cliente
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o seu nome: ");
        scanner.nextLine(); // Limpar o buffer do scanner
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        scanner.close(); // Desligo o scanner
    }

    public static String retornaMensagem() {
        // Exibindo a mensagem final
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. "
                + "Sua agência é " + agencia + ", conta " + numeroConta
                + " e seu saldo " + saldo + " já está disponível para saque.";
    }
}