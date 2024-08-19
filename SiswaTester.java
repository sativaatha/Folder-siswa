//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object 
        //namaClass namaObject = new Coontructor();
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa lia = new Siswa();
        Siswa grace = new Siswa();
        Siswa bella = new Siswa();

        sabrina.id = 32;
        sabrina.nama = "sabrina";
        sabrina.ipk = 85.7;
        rasyid.id = 30; 
        rasyid.nama = "rasyid";
        rasyid.ipk = 86.8;
        lia.id = 6;
        lia.nama = "lia";
        lia.ipk = 87.6;
        grace.id = 12;
        grace.nama = "garace";
        grace.ipk = 98.6;
        bella.id = 5;
        bella.nama = "bella";
        bella.ipk = 89.7;
        sabrina.print();
        rasyid.print();
        lia.print();
        grace.print();
        bella.print();

        
    }
}
