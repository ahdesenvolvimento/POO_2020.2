package poo_exercicio_06.questao_02_e_questao_03;

public class TestaEstoque {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        e.inserir(1, "opa", 10, 50.5);
        e.inserir(2, "opa", 11230, 125);
        e.inserir(2, "opa", 11230, 50.5);
        e.repor(1, 50);
        e.exibir();
        e.excluir(1);

        ProdutoPerecivel p = new ProdutoPerecivel(1, 2, "de", 421, java.time.LocalDate.of(2018, 5, 30));
        p.isValido();
        //e.exibir();

    }


}
