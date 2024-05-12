

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {   
    public static void main(String[] args) throws Exception {

      Scanner scr  = new Scanner(System.in).useLocale(Locale.US);
 
        System.out.println("Digite o Numero da sua Conta");
        int numero = scr.nextInt();

        System.out.println("Digite a Agencia");
        String agencia = scr.next();

        System.out.println("Digite seu Nome Completo");
        String nomeCompleto  = scr.next();

        System.out.println("Valor Saldo");
        double saldo = scr.nextDouble();

       

        System.out.println("Meu numero da conta" + numero);
        System.out.println(agencia);
        System.out.println(nomeCompleto);
        System.out.println( " Meu valor é " + saldo + "real" );

    }
  }


        







        