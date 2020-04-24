package polimorfishmdinamis;

public class Persegi extends Meth{
    private double sisi;

    Persegi(double sisi) {
       this.sisi = sisi;
    }

    @Override
    public double Luas() {
       return this.sisi * this.sisi;
    }
    
}
