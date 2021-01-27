package poo_exercicio_07.questao_01;

import java.util.Scanner;

public class TestaBanco07 {
    public static void main(String[] args) {
        Banco b = new Banco(1);
        Scanner sc = new Scanner(System.in);
        String opcao = "";
        do {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Consultar");
            System.out.println("5 - Creditar");
            System.out.println("6 - Debitar");
            System.out.println("7 - Transferir");

            opcao = sc.next();
            switch (opcao) {
                case "1" :
                    try{
                        System.out.println("Digite o número da conta: ");
                        String numero = sc.next();
                        System.out.println("Digite o saldo da conta: ");
                        double saldo = sc.nextDouble();
                        Conta c = new Conta(numero, saldo);
                        b.inserir(c);
                        b.exibir();
                        break;
                    }catch (AplicacaoException e){
                        System.out.println(e.getMessage());
                        break;
                    }
                case "2":
                    try {
                        System.out.println("Digite o número da conta: ");
                        String num = sc.next();
                        System.out.println("Digite o novo número da conta: ");
                        String novNum = sc.next();
                        System.out.println("Digite o novo saldo: ");
                        double novoSaldo = sc.nextDouble();

                        b.alterarConta(num, novNum, novoSaldo);
                        b.exibir();
                        break;
                    }catch (AplicacaoException e){
                        System.out.println(e.getMessage());
                        break;
                    }

                case "3":
                    try{
                        System.out.println("Digite o número da conta que deseja excluir: ");
                        String numexcluir = sc.next();

                        b.excluir(numexcluir);
                        b.exibir();
                        break;
                    }catch (AplicacaoException e){
                        System.out.println(e.getMessage());
                    }
                case "4":
                    try{
                        System.out.println("Digite o número da conta que deseja consultar: ");
                        String numConsultar = sc.next();
                        b.consultarConta(numConsultar);
                        break;
                    }catch (AplicacaoException e){
                        System.out.println(e.getMessage());
                        break;
                    }
                case "5":
                    try{
                        System.out.println("Digite o número da conta que deseja creditar: ");
                        String numC = sc.next();
                        System.out.println("Digite o valor: ");
                        double val = sc.nextDouble();
                        b.creditar(numC, val);
                        b.exibir();
                        break;
                    }catch (AplicacaoException e){
                        System.out.println(e.getMessage());
                        break;
                    }
                case "6":
                    try{
                        System.out.println("Digite o número da conta que deseja debitar: ");
                        String nc = sc.next();
                        System.out.println("Digite o valor: ");
                        double v = sc.nextDouble();
                        b.debitar(nc, v);
                        b.exibir();
                        break;
                    }catch (AplicacaoException e){
                        System.out.println(e.getMessage());
                        break;
                    }

                case "7":
                    try{
                        System.out.println("Digite o número da conta que deseja creditar: ");
                        String numeroC = sc.next();
                        System.out.println("Digite o número da conta que deseja debitar: ");
                        String numeroD = sc.next();
                        System.out.println("Digite o valor: ");
                        double valor = sc.nextDouble();

                        b.transferir(numeroC, numeroD, valor);
                        b.exibir();

                        break;
                    }catch (AplicacaoException e){
                        System.out.println(e.getMessage());
                    }


            }
        } while (!opcao.equals("9") );
    }
}
