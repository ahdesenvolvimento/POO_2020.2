package poo_exercicio_04.questao_03;

public class Senha {
    String valor;

    boolean iguais(String valor){
        if (this.valor.equals(valor)){
            return true;
        }
        return false;
    }

    //void iguaisTrime(String valor){

    //}
    boolean tamanhoSeguro(){
        if (this.valor.length() >= 6){
            return true;
        }
        return false;
    }
    boolean possuiMaiusculaMinuscula(){
        int x = 0, y = 0;
        for(int i = 0;i < this.valor.length();i++){
            int valor = this.valor.charAt(i);
            if (valor >= 65 && valor <= 92){
                x = 1;
            }
            if (valor >= 97 && valor <= 122){
                y = 1;
            }
        }
        return x == 1 && y == 1;
    }


    boolean possuiNumero(){
        if (this.valor.matches(".*\\d.*")){
            return true;
        }
        return false;
    }

    boolean ehValida(){
        if (this.tamanhoSeguro() && this.possuiMaiusculaMinuscula() && this.possuiNumero()){
            return true;
        }
        return false;
    }


}
