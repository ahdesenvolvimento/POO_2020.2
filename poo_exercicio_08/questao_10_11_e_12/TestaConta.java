package poo_exercicio_08.questao_10_11_e_12;

public class TestaConta {
    public static void main(String[] args) {
        AuditoriaInterna a = new AuditoriaInterna();


        ContaCorrente c = new ContaCorrente("500", 500);
        ContaCorrente c2 = new ContaCorrente("5002", 500);
        ContaCorrente c3 = new ContaCorrente("5001", 500);

        a.adicionar(c.calculoTributos());
        a.adicionar(c2.calculoTributos());
        a.adicionar(c3.calculoTributos());

        SeguroDeVida s = new SeguroDeVida();

        a.adicionar(s.calculoTributos());
        System.out.println(a.calculaTributos());

    }

}
