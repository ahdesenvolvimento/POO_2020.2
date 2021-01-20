package poo_exercicio_06_parte_2.questao_06_07_08_e_09;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Jose", "Antonio");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Sobrenome: " + p.getSobrenome());
        System.out.println("Nome completo: " + p.getNomeCompleto());

        Funcionario f = new Professor();
        Funcionario b = (Funcionario) f;
        f.setMatricula(20);
        f.setSalario(600);
        System.out.println("Primeira parcela: " + f.getPrimeiraParcela());
        System.out.println("Segunda parcela: " + f.getSegundaParcela());
    }
}
