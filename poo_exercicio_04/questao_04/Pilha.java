package poo_exercicio_04.questao_04;

public class Pilha {
    int[] pilha = new int[5];
    int topo = -1;

    void empilhar(int valor){
        this.pilha[++this.topo] = valor;
    }
    boolean estaCheia(){
        if (this.pilha.length == 5){
            return true;
        }
        return false;
    }

    int desempilhar(){
        return this.pilha[this.topo--];
    }

    int retornarTopo(){
        System.out.println("topo" + this.topo);
        return this.pilha[this.topo];
    }

    void exibir(){
        for(int i = 0;i < this.pilha.length;i++){
            System.out.println(this.pilha[i]);
        }
    }
}
