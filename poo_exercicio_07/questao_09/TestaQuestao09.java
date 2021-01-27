package poo_exercicio_07.questao_09;

import poo_exercicio_07.questao_01.AplicacaoException;
import poo_exercicio_07.questao_10.OutRangeException;

public class TestaQuestao09 {
    public static void main(String[] args) {
        try{
            Questao09 q = new Questao09(1);
            q.inserirElemento(50);
            q.inserirElemento(50);
            q.inserirElemento(50);
            //Checked
        }catch (AplicacaoException p){
            System.out.println(p.getMessage());
            //Unchecked
        }catch (OutRangeException e){

        }
        System.out.println("Programa finalizado");

    }
}
