//import java.util.Scanner;
package poo_exercicio_05.questao_03;

public class Calculadora {
    private double operando1, operando2;

    public double somar(){
        return this.operando1 + this.operando2;
    }

    public double subtrair(){
        return this.operando1 - this.operando2;
    }

    public double divisao(){
        return this.operando1 / this.operando2;
    }
    Calculadora(double x, double y){
        this.operando1 = x;
        this.operando2 = y;
    }
}
