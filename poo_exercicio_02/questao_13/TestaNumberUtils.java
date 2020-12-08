package poo_exercicio_02.questao_13;

public class TestaNumberUtils {
    public static void main(String[] args) {
        NumberUtils nu = new NumberUtils();
        nu.n = 13;
        if (nu.isPair()){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
        if (nu.isPrime()){
            System.out.println("Primo");
        }else {
            System.out.println("Nao primo");
        }

        System.out.println(nu.printCount());
        System.out.println(nu.printReverseCount());
    }
}
