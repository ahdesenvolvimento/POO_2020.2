package poo_exercicio_02.questao_11;

public class DecimalNumber {
    double valor;

    int inteira(){
        return (int)valor;
    }
    double decimal(){
        return valor % 1;
    }
}
