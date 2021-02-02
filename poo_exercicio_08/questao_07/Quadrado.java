package poo_exercicio_08.questao_07;

public class Quadrado implements FiguraGeometrica {
    private double lado;

    Quadrado(double l){
        this.lado = l;
    }

    @Override
    public double calculaPerimetro(){
        return 4 * this.lado;
    }

    @Override
    public double calculaArea(){
        return this.lado * this.lado;
    }
}
