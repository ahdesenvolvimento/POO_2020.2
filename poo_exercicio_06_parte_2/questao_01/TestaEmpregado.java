package poo_exercicio_06_parte_2.questao_01;

public class TestaEmpregado {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        Diarista d = new Diarista();
        Horista h = new Horista();
        d.calculaSalario();
        System.out.println(e.calculaSalario());
        System.out.println(d.calculaSalario());
        System.out.println(h.calculaSalario());
    }
}
