package poo_exercicio_06_parte_2.questao_06_07_08_e_09;

public class Funcionario extends Pessoa {
    int matricula;
    double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0 ){
            System.out.println("Salário não pode ser negativo!");
        }else{
            this.salario = salario;
        }
    }

    public double getPrimeiraParcela(){
        return this.salario*0.6;
    }

    public double getSegundaParcela(){
        return this.salario*0.4;
    }
}
