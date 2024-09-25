public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli;
    private double costo;
    private int articoliAggiunti; // Tiene traccia del numero di articoli nel carrello


    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new Articolo[3];
        this.costo = 0.0;
        this.articoliAggiunti = 0;
    }


    public void aggiungiArticolo(Articolo articolo) {
        if (articoliAggiunti < elencoArticoli.length) {
            elencoArticoli[articoliAggiunti] = articolo;
            articoliAggiunti++;
            costo += articolo.getPrezzo();
        } else {
            System.out.println("Il carrello è pieno, non puoi aggiungere più articoli.");
        }
    }


    public double getCosto() {
        return costo;
    }


    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }


    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }


    public void stampaCarrello() {
        System.out.println("Carrello per il cliente: " + clienteAssociato.getDatiCliente());
        System.out.println("Articoli nel carrello:");
        for (int i = 0; i < articoliAggiunti; i++) {
            Articolo articolo = elencoArticoli[i];
            System.out.println("- " + articolo.getDescrizioneArticolo() + " | Prezzo: " + articolo.getPrezzo());
        }
        System.out.println("Costo totale: " + getCosto());
    }
}
