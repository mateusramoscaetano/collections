package com.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  private List<Pessoa> ListaDePessoas;

  public OrdenacaoPessoa() {
    this.ListaDePessoas = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    ListaDePessoas.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(ListaDePessoas);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(ListaDePessoas);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();

    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

    // Exibindo a lista de pessoas adicionadas
    System.out.println(ordenacaoPessoas.ListaDePessoas);

    // Ordenando e exibindo por idade
    System.out.println(ordenacaoPessoas.ordenarPorIdade());

    // Ordenando e exibindo por altura
    System.out.println(ordenacaoPessoas.ordenarPorAltura());

  }
}
