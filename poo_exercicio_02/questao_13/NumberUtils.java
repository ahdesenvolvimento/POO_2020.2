package poo_exercicio_02.questao_13;

public class NumberUtils {
    int n;
    boolean isPair(){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
    boolean isPrime(){
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0){
            return false;
        }
        return true;
    }
    String printCount(){
        String contagem = "";
        for (int i = 0;i < n;i++){
            if (contagem.length() == 0){
                contagem = contagem + Integer.toString(i);
            }else {
                contagem = contagem + "," + Integer.toString(i);
            }

        }
        return contagem;
    }
    String printReverseCount(){
        String contagemReversa = "";
        for (int i = n - 1;i >= 0;i--){
            if (contagemReversa.length() == 0){

                contagemReversa = contagemReversa + Integer.toString(i);
            }else {

                contagemReversa = contagemReversa + "," + Integer.toString(i);
            }

        }
        return contagemReversa;
    }
}
