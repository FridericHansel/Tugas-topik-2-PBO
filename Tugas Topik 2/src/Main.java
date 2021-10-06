import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Buku> buku = new ArrayList<>();

    static void addBook() throws IOException{
        System.out.print("ISBN: ");
        String isbn = bf.readLine();
        System.out.print("Judul: ");
        String judul = bf.readLine();
        System.out.print("Pengarang: ");
        String pengarang = bf.readLine();
        System.out.print("Tahun Terbit: ");
        String tahunterbit = bf.readLine();
        System.out.print("Harga: ");
        int harga = scn.nextInt();
        System.out.print("Rating: ");
        float rating = scn.nextFloat();
        Buku buku = new Buku(isbn, judul, pengarang, tahunterbit, harga, rating);
        buku.add(buku);

        System.out.println("Berhasil menambah buku");
    }

    static void changeBook(int no) throws IOException{
        Buku lama = buku.get(no);
        String isbn = lama.getIsbn();
        System.out.print("Judul: ");
        String judul = bf.readLine();
        System.out.print("Pengarang ");
        String pengarang = bf.readLine();
        System.out.print("Tahun Terbit: ");
        String tahunterbit = bf.readLine();
        System.out.print("Harga: ");
        int harga = scn.nextInt();
        System.out.print("Rating: ");
        float rating = scn.nextFloat();
        Buku buku = new Buku(isbn,judul,pengarang,tahunterbit,harga,rating);
        buku.set(no, buku);

        System.out.println("Berhasil mengubah data buku");
    }

    static void tampil(){
        for (Buku buku : buku){
        System.out.println("ISBN : " + buku.getIsbn());
        System.out.println("Judul Buku : " + buku.getJudulbuku());
        System.out.println("Pengarang : " + buku.getPengarang());
        System.out.println("Tahun Terbit : " + buku.getTahunterbit());
        System.out.println("Harga Buku : " + buku.getHarga());
        System.out.println("Rating Buku : " + buku.getRating());
        }
    }

    static void show(String isbn){
        for (Buku buku : buku){
            if (buku.getIsbn().equals(isbn)){
                System.out.println("ISBN : " + buku.getIsbn());
                System.out.println("Judul Buku : " + buku.getJudulbuku());
                System.out.println("Pengarang : " + buku.getPengarang());
                System.out.println("Tahun Terbit : " + buku.getTahunterbit());
                System.out.println("Harga Buku : " + buku.getHarga());
                System.out.println("Rating Buku : " + buku.getRating());
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        int menu;
        do {
            System.out.println("\n1. Input Buku\n2. Ubah Data Buku\n3. Tampil Semua\n4. Tampil ISBN\n5. Hapus Data Buku\n6. Exit");
            menu = scn.nextInt();
            switch (menu){
                case 1:
                    addBook();
                    break;
                case 2:
                    tampil();
                    System.out.println("buku yang ingin diedit : ");
                    int no = scn.nextInt() - 1;
                    changeBook(no);

                    break;
                case 3:
                    tampil();
                    break;
                case 4:
                    System.out.print("Masukan ISBN: ");
                    String b = bf.readLine();
                    show(b);
                    break;
                case 5:
                    System.out.print("Masukan Index: ");
                    int index = scn.nextInt() - 1;
                    buku.remove(index);
                    break;
            }
        }while (menu != 6);
    }
}
