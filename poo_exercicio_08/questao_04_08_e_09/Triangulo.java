package poo_exercicio_08.questao_04_08_e_09;

public class Triangulo extends FiguraGeometrica implements Comparavel{
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

    @Override
    public int comparar(FiguraGeometrica x){
        if (x.calculaArea() < this.calculaArea()){
            return 1;
        }else if (x.calculaArea() > this.calculaArea()){
            return -1;
        }else{
            return 0;
        }
    }
}
