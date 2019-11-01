package projetopoo;
import java.time.LocalDate;

public class Pedido {
    int idPedido;
    LocalDate dataHorario;

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setDataHorario(LocalDate dataHorario) {
        this.dataHorario = dataHorario;
    }

    public LocalDate getDataHorario() {
        return dataHorario;
    }

    public int getIdPedido() {
        return idPedido;
    }
}
