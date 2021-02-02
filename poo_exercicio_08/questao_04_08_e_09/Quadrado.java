package poo_exercicio_08.questao_04_08_e_09;

public class Quadrado extends FiguraGeometrica implements Comparavel{
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
