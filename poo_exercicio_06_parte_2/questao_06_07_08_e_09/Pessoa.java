package poo_exercicio_06_parte_2.questao_06_07_08_e_09;

public class Pessoa {
    private String nome, sobrenome;

    Pessoa(){

    }
    Pessoa(String n, String sn){
        this.nome = n;
        this.sobrenome = sn;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }
}
