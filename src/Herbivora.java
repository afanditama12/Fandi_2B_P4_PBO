// mewarisi kelas hewan
public class Herbivora extends Hewan {
    // field / attribut dari class herbivora
    String jenisMakanan;

    // method cara makan class herbivora
    public void caraMakan(String caraMakan) {
        System.out.println("Cara Makan Hewan Herbivora Adalah : " + caraMakan);
    }

    // method jenis makanan class herbivora
    public void jenisMakanan(String jenisMakanan) {
        System.out.println("Jenis Makanan Hewan Herbivora Adalah : " + jenisMakanan);
    }
}
