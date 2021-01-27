package poo_exercicio_07.questao_01;

public class Banco {
    private Conta[] contas;
    private int indice;
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
            this.contas[indice] = c;
            this.indice++;
        }else{
            throw new AplicacaoException("Tamanho do array foi excedido");
        }

    }

    private Conta consultar(String numero){
        Conta c = null;
        for(int i = 0;i < indice;i++){
            if (this.contas[i].getNumero().equals(numero)){
                c = this.contas[i];
                return c;
            }
        }

        throw new AplicacaoException("Conta não encontrada");
    }

    public void consultarConta(String numero){
        Conta conta = this.consultar(numero);
        if (conta != null){
            System.out.println("Número da conta: " + conta.getNumero());
            System.out.println("Saldo: " + conta.getSaldo());
        }
    }
    void creditar(String numero, double valor){
        Conta conta = this.consultar(numero);
        if (conta != null){
            conta.depositar(valor);
        }
    }

    void debitar(String numero, double valor){
        Conta conta = this.consultar(numero);
        if (conta != null){
            conta.sacar(valor);
        }
    }

    void excluir(String numero){
        Conta conta = this.consultar(numero);
        if (conta != null){
            for (int i = 0;i < this.indice;i++){
                if (this.contas[i].getNumero().equals(numero)){

                    this.contas[i] = null;
                    this.indice--;
                }
            }
        }
    }

    void alterarConta(String numero, String novoNumero, double novoSaldo){
        Conta conta = this.consultar(numero);
        if (conta != null){
            for (int i = 0;i < this.indice;i++){
                if (this.contas[i].getNumero().equals(numero)){
                    this.contas[i].setNumero(novoNumero);
                    this.contas[i].setSaldo(novoSaldo);
                }
            }
        }
    }

    void exibir(){

        for(int i = 0;i < this.indice ;i++){
            System.out.println(this.contas[i].getNumero() + " " + this.contas[i].getSaldo());
        }
    }

    void transferir(String numCredito, String numDebito, double valor){
        Conta c1 = this.consultar(numCredito);
        Conta c2 = this.consultar(numDebito);
        if (c2 != null){
            if (c1 != null){
                c2.transferir(c1, valor);
            }
        }
    }
    int totalContas(){
        return this.indice;
    }
    double totalDinheiro(){
        double variavel = 0;
        for(int i=0;i < this.contas.length;i++){
            variavel += this.contas[i].getSaldo();
        }
        return variavel;
    }
    double mediaContas(){
        double variavel = 0;
        for(int i=0;i < this.contas.length;i++){
            variavel += this.contas[i].getSaldo();
        }
        return variavel/this.indice;
    }
}
