package poo_exercicio_07.questao_12;

public class Teste {
    public static void main(String args[]) {
        // o programa entra no primeiro try, nesse try ele gera um exception, no primeiro catch
        // esse exception é capturado, o processo é repetido, o segundo try gera outro exception
        // que é capturado pelo segundo catch, no fim do segundo catch, tem o print de A, no fim do segundo catch
        // tem o print de B e fora do escopo do try e catch tem o print de C
        try {
            System.out.println("aqui");
            throw new RuntimeException("viado");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            try {
                System.out.println("aqui 2");
                throw new RuntimeException();
            } catch (RuntimeException e2) {
                System.out.println("aqui 3");
                System.out.print("A");
            }
            System.out.print("B");
        }
        System.out.print("C");
    }
}
