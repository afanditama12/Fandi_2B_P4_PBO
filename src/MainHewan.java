public class MainHewan {
    public static void main(String[] args) {
        // objeck Hewan
        var hewan = new Hewan();
        // method cara makan hewan
        hewan.caraMakan("Menggunakan Gigi Untuk Mengunyah Makanan");
        // method cara bersuara hewan
        hewan.caraBersuara("Menggunakan Pita Suara");
        // method cara gerak hewan
        hewan.caraGerak("Menggunakan Kaki");

        // objeck karnivora
        var karnivora = new Karnivora();
        karnivora.caraMakan("Menggunakan Gigi Berbentuk Runcing Untuk Mengunyah Makanan Berjenis Daging");

        // method jenis makanan objeck karnivora
        karnivora.jenisMakanan("Daging");

        // objeck Herbivora
        var herbivora = new Herbivora();
        herbivora.caraMakan("Menggunakan Gigi Berbentuk Tumpul Untuk Mengunyah Makanan Berjenis Tumbuhan");

        // method jenis makanan objeck herbivora
        herbivora.jenisMakanan("Tumbuhan");

    }
}
