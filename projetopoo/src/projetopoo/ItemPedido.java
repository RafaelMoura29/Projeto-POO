package projetopoo;

public class ItemPedido {
    Double desconto;
    int quantidade;
    Double preco;

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }
}
