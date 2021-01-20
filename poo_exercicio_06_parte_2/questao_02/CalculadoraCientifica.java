package poo_exercicio_06_parte_2.questao_02;

public class CalculadoraCientifica extends Calculadora {

    CalculadoraCientifica(double x, double y){
        super(x, y);
    }
    public double exponenciar(int base, int expoente){
        return Math.pow(base, expoente);
    }

    public double divisao(boolean x){
        if (x){
            return Math.floor(super.divisao());
        }else {
            return super.divisao();
        }
    }
}
