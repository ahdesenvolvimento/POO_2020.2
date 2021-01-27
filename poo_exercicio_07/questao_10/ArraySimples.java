package poo_exercicio_07.questao_10;

public class ArraySimples {
    int indice;
    int[] array;

    public ArraySimples(int t){
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
