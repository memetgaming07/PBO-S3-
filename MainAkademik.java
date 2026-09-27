public class MainAkademik{

    public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa("1234567890","ahmad",20,4.00);
    Mahasiswa mhs2 = new Mahasiswa("1234567891","bayu",22,3.50);
    
    System.out.println("Data Mahasiwa sebelum ditanmbah");
    mhs1.tampilkanData();
    mhs2.tampilkanData();

    mhs1.hitungIPKSemester(3.90);
    mhs1.hitungIPKSemester(4.00, 2);

    System.out.println("Data Mahasiwa setelah ditambah");
    mhs1.tampilkanData();
    mhs2.tampilkanData();

    }
}