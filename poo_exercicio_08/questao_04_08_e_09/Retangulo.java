package poo_exercicio_08.questao_04_08_e_09;

public class Retangulo extends FiguraGeometrica implements Comparavel{
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
