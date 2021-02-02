package poo_exercicio_08.questao_10_11_e_12;
import java.util.ArrayList;
import java.util.List;

public class AuditoriaInterna {
    List<Double> tributaveis = new ArrayList<Double>();

    public void adicionar(double valor){
        this.tributaveis.add(valor);
    }

    public double calculaTributos(){
        double total = 0;
        for (double x : tributaveis){
            total = total + x;
        }
        return total;
    }


}
