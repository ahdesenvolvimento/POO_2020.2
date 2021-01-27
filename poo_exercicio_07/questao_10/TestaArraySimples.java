package poo_exercicio_07.questao_10;

public class TestaArraySimples {
    public static void main(String[] args) {
        try {
            ArraySimples a = new ArraySimples(1);
            a.inserirElemento(5);
            a.inserirElemento(5);
        }catch (AplicacaoException e){
            System.out.println(e.getMessage());
        }catch (OutRangeException i){
            System.out.println(i.getMessage());
        }finally {
            System.out.println("Programa executado!");
        }
    }
}
