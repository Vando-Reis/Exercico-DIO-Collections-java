package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class Listatarefa {
    private List<Tarefas> tarefasList;


    // construtor para criaçao de uma pre lista vazia
    public Listatarefa() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for (Tarefas t : tarefasList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefasList.size();
    }

    public void obterDescricoestarefas(){
        System.out.println(tarefasList);
    }
    public static void main(String[] args) {
        Listatarefa listatarefa = new Listatarefa();
        System.out.println(" O numero total de elementos na lista e " + listatarefa.obterNumeroTotalTarefas());

        listatarefa.adicionarTarefa("Tarefa 1 ");
        listatarefa.adicionarTarefa("Tarefa 1 ");
        listatarefa.adicionarTarefa("Tarefa 2 ");
        System.out.println(" O numero total de elementos na lista e " + listatarefa.obterNumeroTotalTarefas());

        listatarefa.removerTarefa("Tarefa 2 ");
        System.out.println(" O numero total de eelemntos na lista e " + listatarefa.obterNumeroTotalTarefas());

        listatarefa.obterDescricoestarefas();

    }
}