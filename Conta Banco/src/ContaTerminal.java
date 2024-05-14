import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite o numero ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        
    
        System.out.println("Olá" + nomeCliente);
        System.out.println("obrigado por criar uam conta e nosso banco, sua agencia" + agencia);
        System.out.println("Conta"+numero);
        System.out.println("e seu saldo " + saldo + "ja esta disponivel");
        
        
    }
        
}