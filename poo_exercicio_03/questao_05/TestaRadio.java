package poo_exercicio_03.questao_05;

public class TestaRadio {
    public static void main(String[] args) {
        Radio r = new Radio(2);
        r.volume = 10;
        System.out.println(r.volume);
    }
    /*O erro se dá pois a classe é inicializada por um construtor e no trecho de código, não tem nenhum parametro para o construtor
    logo ele da erro
     */
}
