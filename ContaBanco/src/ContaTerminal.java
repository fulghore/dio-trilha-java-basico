import java.util. Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Por favor, digite o número da conta");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a agência");
        String agencia = scanner.next();
        scanner.nextLine();


        System.out.println("Informe seu nome completo");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe seu saldo");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        String saldoFormatado = String.format("%.2f", saldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldoFormatado + " já está disponível para saque.");
        
        
    }
}
