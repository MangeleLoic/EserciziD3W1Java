public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public void  setBase(double base) {
        this.base = base;
    }
    public void  setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }
    public double perimetro() {
        return (base + altezza) * 2;
    }


    public double area() {
        return base * altezza;
    }

    public void stampaRettangolo() {
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }


}
