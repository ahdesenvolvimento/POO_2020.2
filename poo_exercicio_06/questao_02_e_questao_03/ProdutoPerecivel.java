package poo_exercicio_06.questao_02_e_questao_03;
import java.time.LocalDate;


public class ProdutoPerecivel extends Produto {
    LocalDate dataValidade;
    ProdutoPerecivel(int i, int qnt, String desc, double valor, LocalDate dt){
        super(i, desc, valor, qnt);
        this.dataValidade = dt;

    }
    void isValido(){
        LocalDate data = LocalDate.now();
        if (data.isAfter(this.dataValidade)){
            System.out.println("Vencido");
        }else{
            System.out.println("Não vencido");
        }
        System.out.println(data);

    }
}
