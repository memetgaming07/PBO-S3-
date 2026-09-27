public class Mahasiswa{

    // 1. Atribut
    public String nim;
    public String nama;
    public int sks;
    public double ipk;

    // 2. Constructor dengan 4 parameter
    public Mahasiswa(String nimMahasiswa, String namaMahasiswa, int sksMahasiswa, double ipkMahasiswa) {
        this.nim = nimMahasiswa;
        this.nama = namaMahasiswa;
        this.sks = sksMahasiswa;
        this.ipk = ipkMahasiswa;
    }

    // 3. Method Overloading — Versi 1
    public void hitungIPKSemester(double nilaiAkhir) {
        this.ipk = (this.ipk + nilaiAkhir) / 2;
    }

    // 3. Method Overloading — Versi 2
    public void hitungIPKSemester(double nilaiAkhir, int bobotSks) {
       this.ipk = ((this.ipk * this.sks) + (nilaiAkhir * bobotSks)) / (this.sks + bobotSks);
        this.sks = this.sks + bobotSks;
    }

    public void tampilkanData(){
            System.out.println("NIM         :" + nim);
            System.out.println("Nama        :" + nama);
            System.out.println("Total SKS   :" + sks);
            System.out.println("IPK         :" + ipk);
            System.out.println("======================================");
    }
}