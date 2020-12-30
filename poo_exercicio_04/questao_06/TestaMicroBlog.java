package poo_exercicio_04.questao_06;

public class TestaMicroBlog {
    public static void main(String[] args) {
        MicroBlog mb = new MicroBlog(2);
        mb.inserirPostagem(1, "Jose");
        mb.inserirPostagem(2, "DIJSADOSAJOI");
        mb.curtir(1);
        mb.curtir(1);
        mb.curtir(2);
        System.out.println("A postagem mais curtida: "+ mb.postagemMaisCurtida());
        mb.exibir();
        mb.excluirPostagem(2);
        mb.exibir();
    }
}
