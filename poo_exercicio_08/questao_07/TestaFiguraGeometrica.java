package poo_exercicio_08.questao_07;

public class TestaFiguraGeometrica {
    public static void main(String[] args) {

        Quadrado q = new Quadrado(2);

        Triangulo t = new Triangulo(1, 2, 3, 5, 10);
        Retangulo r = new Retangulo(10, 6);

        System.out.println("Quadrado");
        System.out.println(q.calculaArea());
        System.out.println(q.calculaPerimetro());

        System.out.println("Triangulo");
        System.out.println(t.calculaArea());
        System.out.println(t.calculaPerimetro());

        System.out.println("Retangulo");
        System.out.println(r.calculaArea());
        System.out.println(r.calculaPerimetro());
    }
}
