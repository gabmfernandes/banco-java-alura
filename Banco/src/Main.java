import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Clark kent";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        String menuOpcoes = """
                
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                """;

        Scanner scanner = new Scanner(System.in);


        System.out.println("**********************************************\n");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: "+nome);
        System.out.println("Tipo Conta: "+tipoConta);
        System.out.println("Saldo Inicial: "+saldo);
        System.out.println("\n**********************************************");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println(menuOpcoes);
            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(String.format("Saldo atual: R$%.2f",saldo));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println(String.format("Saldo atualizado: R$%.2f",saldo));
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double transferir = scanner.nextDouble();
                    if (transferir <= saldo) {
                        saldo -= transferir;
                        System.out.println(String.format("Saldo atualizado: R$%.2f",saldo));
                    } else {
                        System.out.println("Impossível transferir um valor maior que o saldo disponível");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
            }
        }


    }
}