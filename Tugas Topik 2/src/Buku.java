public class Buku {
    private final String isbn;
    private String judulbuku;
    private String pengarang;
    private String tahunterbit;
    private int harga;
    private float rating;

    public Buku(String isbn, String judulbuku, String pengarang, String tahunterbit, int harga, float rating){
        this.isbn = isbn;
        this.judulbuku = judulbuku;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
        this.harga = harga;
        this.rating = rating;
    }

    public void setJudulbuku(String judulbuku){
        this.judulbuku = judulbuku;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public void setTahunterbit(String tahunterbit){
        this.tahunterbit = tahunterbit;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public void setRating(float rating){
        this.rating = rating;
    }

    public String getIsbn(){
        return isbn;
    }
    public String getJudulbuku(){
        return judulbuku;
    }
    public String getPengarang(){
        return pengarang;
    }
    public String getTahunterbit(){
        return tahunterbit;
    }
    public int getHarga(){
        return harga;
    }
    public float getRating(){
        return rating;
    }

    public void add(Buku buku) {
    }

    public void set(int no, Buku buku) {
    }
}
