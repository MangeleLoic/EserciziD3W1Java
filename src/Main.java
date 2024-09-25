public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(21.5, 12);
        System.out.println(" la base del primo rettangolo è: " + r1.getBase());
        System.out.println(" l'altezza del primo rettangolo è: " + r1.getAltezza());
        System.out.println("il perimetro del primo rettangolo è: " + r1.perimetro());
        System.out.println("l'area del primo rettangolo è: " + r1.area());
        r1.stampaRettangolo();

        Rettangolo r2 = new Rettangolo(17.5, 9.3);
        System.out.println(" la base del secondo rettangolo è: " + r2.getBase());
        System.out.println(" l'altezza del secondo rettangolo è: " + r2.getAltezza());
        System.out.println("il perimetro del secondo rettangolo è: " + r2.perimetro());
        System.out.println("l'area del secondo rettangolo è: " + r2.area());
        r2.stampaRettangolo();

        sum(r1,r2);

        Articolo articolo1 = new Articolo(12345,"PlayStation 5", 499.99, 15 );
        System.out.println("Articolo: " + articolo1.getCodiceArticolo() + ", descizione: " + articolo1.getDescrizioneArticolo() + ", Pezzi disponibili " + articolo1.getNumeroPezziDisponibili() + ", Prezzo: " +articolo1.getPrezzo());

        Articolo articolo2 = new Articolo(74251,"Iphone 15", 1499.99, 10 );
        System.out.println("Articolo: " + articolo2.getCodiceArticolo() + ", descizione: " + articolo2.getDescrizioneArticolo() + ", Pezzi disponibili " + articolo2.getNumeroPezziDisponibili() + ", Prezzo: " +articolo2.getPrezzo());

        Articolo articolo3 = new Articolo(65342,"Samsung s21", 999.99, 25 );
        System.out.println("Articolo: " + articolo3.getCodiceArticolo() + ", descizione: " + articolo3.getDescrizioneArticolo() + ", Pezzi disponibili " + articolo3.getNumeroPezziDisponibili() + ", Prezzo: " +articolo3.getPrezzo());

        Cliente cliente1 = new Cliente(777,"Mario Rossi", "Mariorossi@epicode.it", "12 Giugno 2022" );
        System.out.println("codice cliente: " + cliente1.getCodiceCliente() + ", nome e cognome: " + cliente1.getDatiCliente() + ", email: " + ", iscritto in data: " + cliente1.getDataIscrizione());

        Cliente cliente2 = new Cliente(888,"Maria Bianchi", "Mariabianchii@epicode.it", "16 Giugno 2022" );
        System.out.println("codice cliente: " + cliente2.getCodiceCliente() + ", nome e cognome: " + cliente2.getDatiCliente() + ", email: " + ", iscritto in data: " + cliente2.getDataIscrizione());

        Cliente cliente3 = new Cliente(999,"Franco Neri", "Franconeri@epicode.it", "24 Marzo 2022" );
        System.out.println("codice cliente: " + cliente3.getCodiceCliente() + ", nome e cognome: " + cliente3.getDatiCliente() + ", email: " + ", iscritto in data: " + cliente3.getDataIscrizione());

        Carrello carrello1 = new Carrello(cliente1);
        carrello1.aggiungiArticolo(articolo1);
        carrello1.aggiungiArticolo(articolo2);
        carrello1.stampaCarrello();

        Carrello carrello2 = new Carrello(cliente2);
        carrello2.aggiungiArticolo(articolo2);
        carrello2.aggiungiArticolo(articolo2);
        carrello2.aggiungiArticolo(articolo3);
        carrello2.stampaCarrello();





    }

public static void sum(Rettangolo r1,Rettangolo r2) {
    double sPerimetro = r1.perimetro() + r2.perimetro();
    double sArea = r1.area() + r2.area();
    System.out.println("la somma dei perimetri è: " + sPerimetro);
    System.out.println("la somma delle aree è: " + sArea);
}


    }