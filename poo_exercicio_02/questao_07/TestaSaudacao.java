package poo_exercicio_02.questao_07;

public class TestaSaudacao {
    public static void main(String[] args) {
        Saudacao s = new Saudacao();
        s.destinatario = "Hello";
        s.texto = "Fala";
        System.out.println(s.obterSaudacao());
    }
}
