package poo_exercicio_02.questao_11;

public class TestaDecimalNumber {
    public static void main(String[] args) {
        DecimalNumber dn = new DecimalNumber();
        dn.valor = 5.5;
        System.out.println(dn.inteira());
        System.out.println(dn.decimal());
    }
}
