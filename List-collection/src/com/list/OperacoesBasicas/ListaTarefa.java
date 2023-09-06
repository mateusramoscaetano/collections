package com.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  private List<Tarefa> TarefaList;

  public ListaTarefa() {
    this.TarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    TarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa t : TarefaList) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(t);
      }
    }
    TarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalDeTarefas() {
    return TarefaList.size();
  }

  public void obterDescricoesTarefas() {
    System.out.println(TarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    System.out.println("numero de tarefas é " + listaTarefa.obterNumeroTotalDeTarefas());

    listaTarefa.adicionarTarefa("tarefa um");

    listaTarefa.adicionarTarefa("tarefa um");

    listaTarefa.adicionarTarefa("tarefa dois");
    System.out.println("numero de tarefas é " + listaTarefa.obterNumeroTotalDeTarefas());

    listaTarefa.removerTarefa("tarefa um");

    System.out.println("numero de tarefas depois de remover é " + listaTarefa.obterNumeroTotalDeTarefas());
  }
}
