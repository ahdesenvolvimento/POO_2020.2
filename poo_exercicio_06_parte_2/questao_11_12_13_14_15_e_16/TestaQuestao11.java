package poo_exercicio_06_parte_2.questao_11_12_13_14_15_e_16;

public class TestaQuestao11 {
    public static void main(String[] args) {
        /*V, V, V, V, V*/
        ClasseB b = new ClasseB();
        if (b instanceof ClasseA){
            System.out.println("True");
        }

        ClasseA a = new ClasseA();
        if (a instanceof ClasseB){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        ClasseA c = new ClasseB();
        System.out.println(c.metodo1());
        /*Exibe o metodo 1 da classe b*/
        //System.out.println(c.metodo2());
        /*Da erro, pois não existe o metodo kkkk*/

        /*Irá chamar o metodo1 da classe a na classe b*/

        /*Pois para ter a sobrecarga de metodos, precisam ter parametros diferentes*/
    }
}
