package poo_exercicio_08.questao_07;

public class Retangulo implements FiguraGeometrica {
    private double altura, base;

    Retangulo(double alt, double bas){
        this.altura = alt;
        this.base = bas;
    }

    @Override
    public double calculaPerimetro(){
        return (2*(this.base) + 2*(this.altura));
    }

    @Override
    public double calculaArea(){
        return (this.altura * this.base);
    }
}
