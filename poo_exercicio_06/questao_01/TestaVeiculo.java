package poo_exercicio_06.questao_01;

public class TestaVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("2131", 2018);
        System.out.println("Veiculo: " + v.placa + " " + v.ano);
        Carro c = new Carro("21323", 2018, "12312");
        System.out.println("Carro: " + c.placa + " " + c.ano + " " + c.modelo);
        CarroEletrico ce = new CarroEletrico("21323", 2018, "12312", 124);
        System.out.println("Carro Eletrico: " + ce.placa + " " + ce.ano + " " + ce.modelo + " " + ce.autonomiaBateria);

    }
}
