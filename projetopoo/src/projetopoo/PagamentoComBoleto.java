package projetopoo;

public class PagamentoComBoleto {
    Date dataVencimento;
    Date dataPagamento;

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }
}
