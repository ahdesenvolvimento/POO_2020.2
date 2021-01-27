package poo_exercicio_07.questao_09;

import poo_exercicio_07.questao_01.AplicacaoException;
import poo_exercicio_07.questao_10.OutRangeException;

public class Questao09 {
    int indice;
    int[] array;

    public Questao09(int t){
        if (t <= 0){
            throw new AplicacaoException("O valor do tamanho não pode ser negativo!");
        }
        this.array = new int[t];
    }

    public void inserirElemento(int elemento){
        if (indice < this.array.length){
            this.array[indice] = elemento;
            this.indice++;
        }else{
            throw new OutRangeException("Ultrapassou o tamanho do array!");
        }
    }
}
