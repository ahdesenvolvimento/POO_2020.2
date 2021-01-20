package poo_exercicio_05.questao_03;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora(5, 6);
        System.out.println(c.somar());
        System.out.println(c.subtrair());
    }
}
//Da erro, pois o atributo é privado e só pode ser acessado dentro da propria classe
