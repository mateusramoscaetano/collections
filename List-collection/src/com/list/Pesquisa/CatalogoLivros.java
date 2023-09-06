package com.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> ListaDeLivros;

  public CatalogoLivros() {
    this.ListaDeLivros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    ListaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> listaDeLivrosDoAutor = new ArrayList<>();

    for (Livro livro : ListaDeLivros) {
      if (livro.getAutor().equalsIgnoreCase(autor)) {
        listaDeLivrosDoAutor.add(livro);
        System.out.println("Adicionou " + livro);
      }
    }

    if (listaDeLivrosDoAutor.size() == 0) {
      System.out.println("Nenhum livro do autor " + autor + " encontrado.");
    } else {
      System.out.println(listaDeLivrosDoAutor);
    }

    return listaDeLivrosDoAutor;
  }

  public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal) {
    List<Livro> listaDeLivrosPorIntervaloDeAno = new ArrayList<>();

    for (Livro livro : ListaDeLivros) {
      int anoDePublicacaoDoLivro = livro.getAnoPublicacao();

      if (anoDePublicacaoDoLivro >= anoInicial && anoDePublicacaoDoLivro <= anoFinal) {
        listaDeLivrosPorIntervaloDeAno.add(livro);
      }
    }

    if (listaDeLivrosPorIntervaloDeAno.isEmpty()) {
      System.out.println("Nenhum livro com o intervalo de ano de  " + anoInicial + "/" + anoFinal + " encontrado.");
    } else {
      System.out.println(listaDeLivrosPorIntervaloDeAno);
    }

    return listaDeLivrosPorIntervaloDeAno;
  }

  public Livro pesquisarPorTituloDoLivro(String titulo) {
    Livro livroPorTitulo = null;

    for (Livro livro : ListaDeLivros) {
      String livroAtual = livro.getTitulo();
      if (livroAtual.equalsIgnoreCase(titulo)) {
        livroPorTitulo = livro;
        break;
      }
    }

    if (livroPorTitulo == null) {
      System.out.println("Nenhum livro com o título '" + titulo + "' encontrado.");
    } else {
      System.out.println(livroPorTitulo);
    }

    return livroPorTitulo;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

    catalogoLivros.pesquisarPorAutor("Robert C. Martin");

    catalogoLivros.pesquisarPorAutor("Autor Inexistente");

    catalogoLivros.pesquisarPorIntervaloDeAno(2010, 2022);

    catalogoLivros.pesquisarPorIntervaloDeAno(2025, 2030);

    catalogoLivros.pesquisarPorTituloDoLivro("Java Guia do Programador");

    catalogoLivros.pesquisarPorTituloDoLivro("Título Inexistente");
  }
}
