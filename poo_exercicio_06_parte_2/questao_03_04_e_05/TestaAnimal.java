package poo_exercicio_06_parte_2.questao_03_04_e_05;

public class TestaAnimal {
    public static void main(String[] args) {
        //4º questao
        Animal a = new Bovino();
        Bovino b = (Bovino) a;
        b.setProducaoLeite(5);

        //Peixe p = new Animal();
        Animal[] animal = new Animal[5];
        Peixe p1 = new Peixe();
        Peixe p2 = new Peixe();

        Bovino b1 = new Bovino();
        Bovino b2 = new Bovino();
        Bovino b3 = new Bovino();

        animal[0] = p1;
        animal[1] = p2;
        animal[2] = b1;
        animal[3] = b2;
        animal[4] = b3;

        for (int i = 0;i < animal.length;i++){
            if (animal[i] instanceof Peixe){
                System.out.println("Posição: " + i + "é Peixe");
            }
            if (animal[i] instanceof Bovino){
                System.out.println("Posição: " + i + "é Bovino");
            }
            if (animal[i] instanceof Animal){
                System.out.println("Posição: " + i + "é Animal");
            }
        }


    }
}
