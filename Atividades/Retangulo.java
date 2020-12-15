package Atividades;

class Retangulo {
    double l1, l2;

    double calcularArea(){
        return l1 * l2;
    }
    void setValores(double x, double y){
        this.l1 = x;
        this.l2 = y;
    }
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setValores(10, 10);
        System.out.println(retangulo.calcularArea());
    }
}