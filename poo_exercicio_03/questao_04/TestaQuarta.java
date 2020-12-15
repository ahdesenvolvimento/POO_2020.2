package poo_exercicio_03.questao_04;

public class TestaQuarta {
    public static void main(String[] args) {
        QuestaoQuatro qq = new QuestaoQuatro();
        qq.x(5);
        System.out.println(qq.valor);
        qq.x(10);
        System.out.println(qq.valor);
    }
    /*No trecho valor = valor + valor, o que está acontecendo é que o parametro será incrementado e não o atributo valor
    para isso colocar o THIS ficando this.valor = this.valor + valor;
     */
}
