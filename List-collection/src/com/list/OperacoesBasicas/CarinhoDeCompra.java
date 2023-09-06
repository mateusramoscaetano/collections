package com.list.OperacoesBasicas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CarinhoDeCompra {
  private List<Item> ListaDeItens;
  DecimalFormat df = new DecimalFormat("#,##0.00");

  public CarinhoDeCompra() {
    this.ListaDeItens = new ArrayList<>();
  }

  public void adicionarUmItem(String nome, double preco, int quantidade) {
    ListaDeItens.add(new Item(nome, preco, quantidade));
  }

  public void removerUmItem(String nome) {
    Item itemParaRemover = null;

    for (Item item : ListaDeItens) {
      if (item.nome.equalsIgnoreCase(nome)) {
        itemParaRemover = item;
        break;
      }
    }

    if (itemParaRemover == null) {
      System.out.println("Item '" + nome + "' não encontrado no carrinho.");
    }

    ListaDeItens.remove(itemParaRemover);
  }

  public void calcularValorTotal() {
    double valorTotal = 0.0;

    for (Item item : ListaDeItens) {
      double subtotalItem = item.quantidade * item.preco;
      valorTotal += subtotalItem;
    }

    System.out.println("O valor total da lista de compras é " + df.format(valorTotal));
  }

  public void exibirItens() {
    if (ListaDeItens.size() == 0) {
      System.out.println("A lista não possui nenhum item.");
      return;
    }

    for (Item item : ListaDeItens) {
      System.out
          .println("Nome: " + item.nome + ", Preço: R$" + df.format(item.preco) + ", Quantidade: " + item.quantidade);
    }
  }

  public static void main(String[] args) {
    CarinhoDeCompra carrinhoDeCompra = new CarinhoDeCompra();

    carrinhoDeCompra.adicionarUmItem("banana", 3.2, 2);

    carrinhoDeCompra.adicionarUmItem("cereal", 15.0, 3);

    carrinhoDeCompra.exibirItens();

    carrinhoDeCompra.calcularValorTotal();

    carrinhoDeCompra.removerUmItem("acerola");

    carrinhoDeCompra.exibirItens();
  }
}
