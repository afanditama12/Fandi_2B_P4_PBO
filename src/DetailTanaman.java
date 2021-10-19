public class DetailTanaman {
    public static void main(String[] args) {
        // buat objeck dengan variabel
        var tanaman = new Tanaman();

        // method setter
        tanaman.setNama("Mawar");
        tanaman.setJenis("Tanaman Berduri");
        tanaman.setCaraBerkembangBiak("Vegetatif");
        tanaman.setTempatHidup("Daratan");

        // method getter
        System.out.println("Nama Tanaman : " + tanaman.getNama("Mawar"));
        System.out.println("Jenis Tanaman : " + tanaman.getJenis("Tanaman Berduri"));
        System.out.println("Cara Berkembang Biak Tanaman : " + tanaman.getCaraBerkembangBiak("Vegetatif"));
        System.out.println("Tempat Hidup Tanaman : " + tanaman.getTempatHidup("Daratan"));
    }
}
