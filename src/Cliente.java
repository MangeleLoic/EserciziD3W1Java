public class Cliente {
    private int codiceCliente;
    private String datiCliente;
    private String eMailCliente;
    private String dataIscrizione;

    public Cliente(int codiceCliente, String datiCliente, String eMailCliente, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.datiCliente = datiCliente;
        this.eMailCliente = eMailCliente;
        this.dataIscrizione = dataIscrizione;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public void setDatiCliente(String datiCliente) {
        this.datiCliente = datiCliente;
    }

    public String getDatiCliente() {
        return datiCliente;
    }

    public void seteMailCliente(String eMailCliente) {
        this.eMailCliente = eMailCliente;
    }

    public String geteMailCliente() {
        return eMailCliente;
    }

    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }
}
