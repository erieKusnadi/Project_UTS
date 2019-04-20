package entity;

public class TokoBuku {

    private String IdBuku;
    private String NBuku;
    private String HBuku;

    public TokoBuku(String IdBuku, String NBuku, String HBuku) {
        this.IdBuku = IdBuku;
        this.NBuku = NBuku;
        this.HBuku = HBuku;
    }

    public boolean equals(Object object) {
        TokoBuku tkbk = (TokoBuku) object;
        return IdBuku.equals(tkbk.getidbuku());
    }

    public String getidbuku() {

        return IdBuku;
    }

    public void setId(String IdBuku) {
        this.IdBuku = IdBuku;
    }

    public String getNama() {

        return NBuku;
    }

    public void setNama(String nama) {

        this.NBuku = nama;
    }

    public String getharga() {

        return HBuku;
    }

    public void setHarga(String harga) {

        this.HBuku = harga;
    }
}