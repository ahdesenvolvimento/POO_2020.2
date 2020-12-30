package poo_exercicio_04.questao_06;

public class MicroBlog {
    Postagem[] postagens;
    int indice;

    MicroBlog(int maximo){
        postagens = new Postagem[maximo];
    }

    Postagem consultar(int id){
        Postagem p = null;
        for(int i = 0;i < postagens.length;i++){
            if (postagens[i].id == id){
                p = postagens[i];
            }
        }
        return p;
    }

    void inserirPostagem(int id, String texto){
        Postagem p = new Postagem(id, texto);
        if (indice < postagens.length){
            postagens[indice] = p;
            indice++;
        }else{
            System.out.println("Sem tamanho");
        }
    }

    void excluirPostagem(int id){
        for(int i = 0;i < postagens.length;i++){
            if (postagens[i].id == id){
                postagens[i] = null;
                indice--;
            }
        }
    }

    Postagem postagemMaisCurtida(){
        int maximo = 0;
        Postagem p = null;
        for(int i = 0;i < postagens.length;i++){
            if (postagens[i].qtdCurtidas > maximo){
                maximo = postagens[i].qtdCurtidas;
                p = postagens[i];
            }
        }
        return p;
    }

    void curtir(int id){
        Postagem p = this.consultar(id);
        if (p != null){
            p.curtir();
        }else{
            System.out.println("Postagem nao existe");
        }
    }

    void exibir(){
        for(int i = 0;i < postagens.length;i++){
            System.out.println(this.postagens[i].id + " " + this.postagens[i].texto);
        }
    }

}
