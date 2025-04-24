package list.OperacoesBasicas;

public class Tarefas {
    // atributo
    private String descricao;

    // construtor serve pra objetos sejam criados corretamente
    public Tarefas(String descricao) {
        this.descricao = descricao;
    }

    // para rertornar o valor do atributo
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao ;
    }
}
