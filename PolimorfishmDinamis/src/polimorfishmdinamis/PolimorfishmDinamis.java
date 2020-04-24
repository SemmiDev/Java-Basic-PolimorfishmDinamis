package polimorfishmdinamis;

public class PolimorfishmDinamis {

    public static void main(String[] args) {
        // polimorfishm dinamis
        Bentuk a;
        a = new Persegi(12);
            System.out.println(a.Luas());
        a = new PersegiPanjang(10,5);
            System.out.println(a.Luas());
    }
    
}
