package poo_exercicio_06.questao_02_e_questao_03;

import java.time.LocalDate;
import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> produtos  = new ArrayList<Produto>();


    void inserir(int valor, String desc, int quant, double val){
        Produto p = this.consultar(valor);
        if (p != null){
            System.out.println("Produto " + valor + "já cadastrado");
        }else{
            Produto produto = new Produto(valor, desc, val, quant);
            this.produtos.add(produto);
        }

    }


    void repor(int id, int quantidade){
        Produto p = this.consultar(id);
        if (p != null){
            p.repor(quantidade);
        }else{
            System.out.println("Produto não existe");
        }
    }

    void darBaixa(int id, int quantidade){
        Produto p = this.consultar(id);
        if (p != null){
            p.darBaixa(quantidade);
        }else{
            System.out.println("Produto não existe");
        }
    }

    void exibir(){
        if (this.produtos.size() <= 0){
            System.out.println("Sem itens");
        }else{
            for (Produto p : this.produtos){
                System.out.println("-----------------------");
                System.out.println("Id: "+p.id);
                System.out.println("Descrição: "+p.descricao);
                System.out.println("Valor: "+p.valor);
                System.out.println("Quantidade: "+p.quantidade);
                System.out.println("-----------------------");
            }
        }
    }

    Produto consultar(int id){
        Produto p = null;
        for (Produto d : this.produtos){
            if (d.id == id){
                p = d;
                break;
            }
        }
        return p;
    }

    void excluir(int id){
        for (Produto p : this.produtos){
            if (p.id == id){
                this.produtos.remove(p);
            }
        }
    }

    /*
    boolean validarId(int id){
        for (int i = 0;i < this.produtos.size();i++){
            if (this.produtos[i] == id){
                return true;
            }
        }
        return false;
    }

     */
}
