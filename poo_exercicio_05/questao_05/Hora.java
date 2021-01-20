package poo_exercicio_05.questao_05;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void getHoras(){
        System.out.println("" + this.getHora() + ":" + "" + this.getMinutos() + ":" + "" + this.getSegundos());
    }


}
