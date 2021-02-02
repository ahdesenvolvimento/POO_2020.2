package poo_exercicio_08.questao_07;

public class Triangulo implements FiguraGeometrica{
    private double lado1, lado2, lado3, altura, base;

    Triangulo(double l1, double l2, double l3, double alt, double bas){
        this.altura = alt;
        this.base = bas;
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    @Override
    public double calculaPerimetro(){
        return (this.lado1 + this.lado2 + this.lado3);
    }

    @Override
    public double calculaArea(){
        return (this.altura * this.base)/2;
    }
}