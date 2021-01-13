package poo_exercicio_06.questao_01;

public class CarroEletrico extends Carro {
    int autonomiaBateria;
    CarroEletrico(String placa, int ano, String modelo, int autonomiaBateria){
        super(placa, ano, modelo);
        this.autonomiaBateria = autonomiaBateria;
    }
}
