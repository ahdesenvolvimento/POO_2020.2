package poo_exercicio_08.questao_04_08_e_09;

public class TestaFigurasGeometricas {
    public static void main(String[] args) {
        FiguraGeometrica[] g = new FiguraGeometrica[10];

        Quadrado q = new Quadrado(2);
        g[1]= q;
        for (int i = 0;i<g.length;i++){
            System.out.println(g[i]);
        }
        Triangulo t = new Triangulo(1, 2, 3, 5, 10);
        Retangulo r = new Retangulo(10, 6);

        System.out.println("Quadrado");
        System.out.println("Area: "+q.calculaArea());
        System.out.println("Perimetro: "+q.calculaPerimetro());

        System.out.println("Triangulo");
        System.out.println("Area: "+t.calculaArea());
        System.out.println("Perimetro: "+t.calculaPerimetro());

        System.out.println("Retangulo");
        System.out.println("Area: "+r.calculaArea());
        System.out.println("Perimetro: "+r.calculaPerimetro());

        int x = q.comparar(t);
        if (x == 1){
            System.out.println("A área do quadrado é maior");
        }else if (x == -1){
            System.out.println("A área do quadrado é menor");
        }else{
            System.out.println("Áreas iguais");
        }

        int y = r.comparar(q);
        if (y == 1){
            System.out.println("A área do retangulo é maior");
        }else if (y == -1){
            System.out.println("A área do retangulo é menor");
        }else{
            System.out.println("Áreas iguais");
        }

        int z = t.comparar(q);
        if (z == 1){
            System.out.println("A área do triangulo é maior");
        }else if (z == -1){
            System.out.println("A área do triangulo é menor");
        }else{
            System.out.println("Áreas iguais");
        }
    }
}
