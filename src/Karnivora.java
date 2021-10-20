// mewarisi class hewan
public class Karnivora extends Hewan {
    // field / attribut class karnivora
    String jenisMakanan;

    // method cara makan class karnivora
    public void caraMakan(String caraMakan) {
        System.out.println("Cara Makan Hewan Karnivora Adalah : " + caraMakan);
    }

    // method jenis makan class karnivora
    public void jenisMakanan(String jenisMakan) {
        System.out.println("Jenis Makanan Hewan Karnivora Adalah : " + jenisMakan);
    }
}
