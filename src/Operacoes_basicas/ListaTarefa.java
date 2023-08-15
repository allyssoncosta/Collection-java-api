package Operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList();// chamou lista de tarefa, gera uma nova arraylist.
    }

    public void adicionarTarefa(String descricao){
tarefalist.add(new tarefa(descricao));
    }

    public void removertarefa(String descricao){
        List<tarefa> tarefaParaRemover = new ArrayList<>();
        for (tarefa t : tarefalist){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalDeTarefa(){
        return tarefalist.size();//size retorna todos elementos que tem dentro dessa list
    }
    public void obterDescricoesTarefa(){
        System.out.println(tarefalist);
    }
    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();
        listatarefa.adicionarTarefa("tarefa 1");
        listatarefa.adicionarTarefa("tarefa 1");
        listatarefa.adicionarTarefa("tarefa 3");
        System.out.println("O numero total de elementos na lista é: " + listatarefa.obterNumeroTotalDeTarefa());
listatarefa.removertarefa("tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listatarefa.obterNumeroTotalDeTarefa());
    listatarefa.obterDescricoesTarefa();
    }
}
