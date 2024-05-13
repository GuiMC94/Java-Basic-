import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite sua agencia");
        String agencia = scanner.next();
        
        System.out.println("Digite seu nome Completo");
        String nomeCliente = scanner.next();

        System.out.println("Digite o numero da conta");
        int numero = scanner.nextInt();
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println(agencia);
        System.out.println(nomeCliente);
        System.out.println(numero);
        System.out.println("Meu saldo é " + saldo + "reais ");
        
        
    }
}
       


        
       
        
        
    




        

        




        







        