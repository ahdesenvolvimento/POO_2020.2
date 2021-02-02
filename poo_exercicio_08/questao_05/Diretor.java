package poo_exercicio_08.questao_05;

public class Diretor extends Funcionario {
    private double salario;

    Diretor(double s){
        this.salario = s;
    }
    @Override
    public double getBonificacao(){
        return this.salario + (this.salario * 0.9);
    }
}
