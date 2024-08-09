//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //object
        //Class object = new Constructor
        SISWA arjuna = new SISWA();
        SISWA arya = new SISWA();
        SISWA matt = new SISWA();
        SISWA epan = new SISWA();
        SISWA eka = new SISWA();

        arjuna.id = 1;
        arjuna.nama = "arjuna";
        arjuna.ipk = 90;

        System.out.println("Nama : " + arjuna.nama);
        System.out.println("Id : " + arjuna.id);
        System.out.println("Ipk : " + arjuna.ipk);

        arya.id = 3;
        arya.nama = "arya";
        arya.ipk = 90;

        System.out.println("Nama : " + arya.nama);
        System.out.println("Id : " + arya.id);
        System.out.println("Ipk : " + arya.ipk);

        epan.id = 10;
        epan.nama = "epan";
        epan.ipk = 90;

        System.out.println("Nama ; " + epan.nama);
        System.out.println("Id : " + epan.id);
        System.out.println("Ipk : " + epan.ipk);

        matt.id = 20;
        matt.nama = "matthew";
        matt.ipk = 90;

        System.out.println("Nama ; " + matt.nama);
        System.out.println("Id : " + matt.id);
        System.out.println("Ipk : " + matt.ipk);

        eka.id = 21;
        eka.nama = "eka";
        eka.ipk = 90;

        System.out.println("Nama : " + eka.nama);
        System.out.println("Id : " + eka.id);
        System.out.println("Ipk : " + eka.ipk);
        
    }
}
