import java.util.Scanner;

public class projeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nome = "Allex Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500;

        String dadosCliente = """
******************************************
Dados iniciais do cliente:
                
Nome:                   %s
Tipo conta:             %s
Saldo inicial:          R$ %.2f 
******************************************
""".formatted(nome, tipoConta, saldo);

        System.out.println(dadosCliente);

        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        String menu = """
Operações
                
1- Consultar saldo
2- Receber valor
3- Transferir valor
4- Sair
                 
                
Digite a opção desejada:     
""";

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é de: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja receber: ");
                    double valorRecebido = leitura.nextDouble();
                    if (valorRecebido > 0) {
                        saldo += valorRecebido;
                        System.out.println("Valor atualizado para: R$ " + saldo);
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    double valorTransferir = leitura.nextDouble();
                    if (valorTransferir > saldo) {
                        System.out.println("Saldo insuficiente para realizar a transferência.");
                    }else if (valorTransferir <= 0) {
                        System.out.println("Valor invalido");
                    }else {
                        saldo -= valorTransferir;
                        System.out.println("Valor de R$ " + valorTransferir + " transferido com sucesso. Saldo atualizado para: R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saindo da conta. Obrigado por usar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println("\n");
        }
        leitura.close();
    }
}