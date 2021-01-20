package poo_exercicio_06_parte_2.questao_01;

public class Diarista extends Empregado {

    @Override
    public double calculaSalario(){

        return (super.calculaSalario()/30);
    }
}
