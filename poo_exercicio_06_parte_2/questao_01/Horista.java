package poo_exercicio_06_parte_2.questao_01;

public class Horista extends Diarista {
    public double calculaSalario(){
        return (super.calculaSalario()/24);
    }
}
