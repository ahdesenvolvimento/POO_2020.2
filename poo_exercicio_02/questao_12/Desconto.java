package poo_exercicio_02.questao_12;

public class Desconto {
    double valorOriginal, desconto;
    double calcular(){
        return valorOriginal * (1-desconto/100);
    }
}
