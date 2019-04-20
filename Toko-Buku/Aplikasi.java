import services.*;
import entity.*;
import java.util.*;

public class Aplikasi {

    private static TokoBukuService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new TokoBukuService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            tampilkanMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("Silahkan periksa input menunya");
                opsi = 0;
            } catch(NoSuchElementException e) {
                System.err.println("Inputnya exhausted");
                opsi = 0;
            } catch(IllegalStateException e) {
                System.err.println("Scanner ketutup");
                opsi = 0;
            }
            seleksi(opsi);
        } while(opsi != 5);
    }

    private static void seleksi(int opsi) {
        switch(opsi) {
            case 1:
                callFormTambahData();
                break;
            case 2:
                callFormUbahData();
                break;
            case 3:
                callFormHapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
        }
    }

    private static void callFormHapusData() {
        scanner = new Scanner(System.in);

        System.out.print("ID BUKU    : ");
        String IdBuku = scanner.nextLine();
        service.hapusData(IdBuku);
    }

    private static void callFormUbahData() {
        scanner = new Scanner(System.in);
        String IdBuku, NBuku, HBuku;

        System.out.println("\n-= Form Ubah Data =-");
        System.out.print("ID BUKU    : ");
        IdBuku = scanner.nextLine();
        System.out.print("NAMA BUKU  : ");
        NBuku = scanner.nextLine();
        System.out.print("HARGA BUKU : ");
        HBuku = scanner.nextLine();
        service.ubahData(new TokoBuku(IdBuku, NBuku, HBuku));
    }

    private static void callFormTambahData() {
        scanner = new Scanner(System.in);
        String IdBuku, NBuku, HBuku;

        System.out.println("\n-= Form Tambah Data =-");
        System.out.print("ID BUKU    : ");
        IdBuku = scanner.nextLine();
        System.out.print("NAMA BUKU  : ");
        NBuku = scanner.nextLine();
        System.out.print("HARGA BUKU : ");
        HBuku = scanner.nextLine();
        service.tambahData(new TokoBuku(IdBuku, NBuku, HBuku));
    }

    private static void tampilkanMenu() {
        System.out.println("    |# | Aplikasi TOKO BUKU    |");
        System.out.println("    _____________________________");
        System.out.println("    |1.| TAMBAH DATA BUKU      |");
        System.out.println("    |2.| UBAH DATA             |");
        System.out.println("    |3.| HAPUS DATA BUKU       |");
        System.out.println("    |4.| MENAMPILKAN DATA BUKU |");
        System.out.println("    |5.| KELUAR                |");
        System.out.println("    =============================");
        System.out.print  ("opsi > ");
    }

}