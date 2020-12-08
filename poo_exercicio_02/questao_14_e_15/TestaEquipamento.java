package poo_exercicio_02.questao_14_e_15;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento o1 = new Equipamento();
        Equipamento o2 = new Equipamento();
        o1.ligar();
        o2.desliga();
        System.out.println("Equipamento 1: " + o1.ligado);
        System.out.println("Equipamento 2: " + o2.ligado);

        o1.inverte();
        o2.inverte();
        System.out.println("Equipamento 1: " + o1.ligado);
        System.out.println("Equipamento 2: " + o2.ligado);

        if (o1.ligado){
            System.out.println("Equipamento 1 está ligado");
        }else {
            System.out.println("Equipamento 1 está desligado ");
        }
        if (o2.ligado){
            System.out.println("Equipamento 2 está ligado");
        }else {
            System.out.println("Equipamento 2 está desligado ");
        }
    }
}
