package poo_exercicio_04.questao_05;

public class Banco {
    Conta[] contas;
    int indice;
    Banco(){

    }
    Banco(int tamanho){
        contas = new Conta[tamanho];
    }
    Banco(int maximo, int tamanho){
        contas = new Conta[maximo];
    }

    void inserir(Conta c){
        if (indice < contas.length){
            System.out.println("here");
            contas[indice] = c;
            indice++;
        }else{
            System.out.println("Nao pode");
        }
    }

    Conta consultar(String numero){
        Conta c = null;
        for(int i = 0;i < indice;i++){
            if (contas[i].numero.equals(numero)){
                c = contas[i];
                break;
            }
        }
        return c;
    }
    void creditar(String numero, double valor){
        Conta conta = this.consultar(numero);
        if (conta != null){
            conta.depositar(valor);
        }else{
            System.out.println("Conta não existe");
        }
    }
    void exibir(){
        for(int i = 0;i < contas.length;i++){
            System.out.println(this.contas[i].numero + " " + this.contas[i].saldo);
        }
    }

    void transferir(String numCredito, String numDebito, double valor){
        Conta c1 = this.consultar(numCredito);
        Conta c2 = this.consultar(numDebito);
        if (c2 != null){
            if (c1 != null){
                c2.transferir(c1, valor);
            }else{
                System.out.println("Conta não existe");
            }
        }else{
            System.out.println("Conta não existe");
        }
    }
    int totalContas(){
        return indice;
    }
    double totalDinheiro(){
        double variavel = 0;
        for(int i=0;i < contas.length;i++){
            variavel += contas[i].saldo;
        }
        return variavel;
    }
    double mediaContas(){
        double variavel = 0;
        for(int i=0;i < contas.length;i++){
            variavel += contas[i].saldo;
        }
        return variavel/indice;
    }
}
