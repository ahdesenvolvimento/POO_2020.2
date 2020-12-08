package poo_exercicio_02.questao_14_e_15;

public class Equipamento {
    boolean ligado;

    void ligar(){
        if (ligado == false){
            ligado = true;
        }

    }
    void desliga(){
        if (ligado == true){
            ligado = false;
        }
    }

    void inverte(){
        if (ligado == true){
            ligado = false;
        } else {
            ligado = true;
        }
    }
    boolean estaLigado(){
        return ligado;
    }
}
