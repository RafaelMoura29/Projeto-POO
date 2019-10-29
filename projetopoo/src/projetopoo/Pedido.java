package projetopoo;

public class Pedido {
    int idPedido;
    Date dataHorario;

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setDataHorario(Date dataHorario) {
        this.dataHorario = dataHorario;
    }

    public Date getDataHorario() {
        return dataHorario;
    }

    public int getIdPedido() {
        return idPedido;
    }
}
