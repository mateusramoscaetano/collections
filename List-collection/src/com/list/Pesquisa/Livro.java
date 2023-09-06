package com.list.Pesquisa;

public class Livro {
  private String titulo;
  private String autor;
  private int anoPublicacao;

  public Livro(String titulo,
      String autor,
      int anoPublicacao) {

    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnoPublicacao() {
    return anoPublicacao;
  }

  public String getTitulo() {
    return titulo;
  }

  @Override
  public String toString() {
    return "Título: " + this.titulo + ", Autor: " + this.autor + ", Ano de Publicação: " + this.anoPublicacao;
  }
}
