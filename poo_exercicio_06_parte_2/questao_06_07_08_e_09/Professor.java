package poo_exercicio_06_parte_2.questao_06_07_08_e_09;

public class Professor extends Funcionario {
    String titulacao;

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getPrimeiraParcela(){
        return 0.0;
    }

    @Override
    public double getSegundaParcela(){
        return super.getPrimeiraParcela() + super.getSegundaParcela();
    }
}
