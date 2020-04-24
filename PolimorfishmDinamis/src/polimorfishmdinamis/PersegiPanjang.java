package polimorfishmdinamis;

public class PersegiPanjang extends Meth{
    private double panjang;
    private double lebar;
    
    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double Luas() {
        return this.panjang * this.lebar;
    }
    
}
