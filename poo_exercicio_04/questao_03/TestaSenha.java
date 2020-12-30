package poo_exercicio_04.questao_03;

public class TestaSenha {
    public static void main(String[] args) {
        Senha s = new Senha();
        s.valor = "Josa123";
        if (s.iguais("Jos1")){
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }

        if (s.possuiMaiusculaMinuscula()){
            System.out.println("Tem");
        }else{
            System.out.println("Nao tem");
        }


        if (s.possuiNumero()){
            System.out.println("Tem numero");
        }else{
            System.out.println("Nao tem numero");
        }



        if (s.tamanhoSeguro()){
            System.out.println("Seguro");
        }else{
            System.out.println("Not seguro");
        }

        if (s.ehValida()){
            System.out.println("Válido");
        }else{
            System.out.println("Não válido");
        }
    }
}
