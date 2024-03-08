import java.util.Scanner;

class Mahasiswa {
    public static String Nama;
    public static String NIM;
    public static String Jurusan;

    public static String tampiluniversitas() {
        // return "UNIVERSITAS MUHAMMADIYAH MALANG\n";

        //return false;
        return "Universitas Muhammadiyah Malang";
    }

    public static void inputdata() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa : ");
        Nama = input.nextLine();

        System.out.println("Masukkan Nim : ");
        NIM = input.nextLine();

        System.out.println("Masukkan jurusan : ");
        Jurusan = input.nextLine();

        if (NIM.length() >= 15) {
            System.out.println("Selamat, data berhasil ditambahkan");

        } else {
            System.out.println("NIM HARUS 15 DIGIT KAK!!!");
        }
        // System.out.println("Masukkan Jurusan");
        // jurusan = input.nextLine();
    }

    public static String tampildataMahasiswa() {
        return "Nama : " + Nama + "\n NIM : " + NIM + "\njurusan : " + Jurusan;

    }
}
public class Main {
    public static void main(String[] args) {
        //deklarasi objek
        Mahasiswa datamahasiswa = new Mahasiswa();
        Scanner input = new Scanner(System.in);

        //inisialisasi value
        int pilihan = 0;
        while (pilihan != 3) {
            System.out.println(" 1. tambah data mahasiswaa");
            System.out.println(" 2. tampilkan nama mahasiswa");
            System.out.println(" 3. keluar");
            System.out.println("masukkan pilihan anda (1-3) : ");
            Scanner objInput = new Scanner(System.in);

            pilihan = objInput.nextInt();
            switch (pilihan){
                case 1:
                    Mahasiswa.inputdata();
                    break;
                case 2:
                    System.out.print("data mahasiswa\n");
                    System.out.println(Mahasiswa.tampiluniversitas());
                    System.out.println(Mahasiswa.tampildataMahasiswa());
                    break;
                case 3:
                    System.out.println("data mahasiswa berhasil ditambahkan");
                default:
                    break;

            }
        }
    }
}
