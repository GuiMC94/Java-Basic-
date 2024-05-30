import java.util.Scanner;

public class SimulacaoBancaria {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        while (true) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo += scanner.nextDouble();
                    System.out.println("Deposito Realizado com Sucesso" + saldo);
                    break;

                case 2:
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("saldo insuficiente");
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo atual" + saldo);
                    }
                    break;

                case 3:
                    System.out.println("saldo ataual" + saldo);
                    break;

                case 0:
                    System.out.println("O programa encerrará.");
                    scanner.close();
                    return;

                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

            }

        }

    }

}
