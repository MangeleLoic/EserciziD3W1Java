import java.util.ArrayList;

public class Carrello {
    private Cliente clienteAssociato;
    private ArrayList<Articolo> elencoArticoli;
    private double costo;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new ArrayList<>();
        this.costo = 0.0;
    }

    public void aggiungiArticolo(Articolo articolo) {
        elencoArticoli.add(articolo);
        costo += articolo.getPrezzo();
    }

    public double getCosto() {
        return costo;
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public ArrayList<Articolo> getElencoArticoli() {
        return elencoArticoli;
    }

}
