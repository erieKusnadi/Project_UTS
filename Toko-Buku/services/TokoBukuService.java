package services;

import java.util.*;
import entity.*;

public class TokoBukuService {

    private static List<TokoBuku> data = new LinkedList<TokoBuku>();

    public void tambahData(TokoBuku tkbk) {
        data.add(tkbk);
        System.out.println("data telah tersimpan");
    }

    public void ubahData(TokoBuku tkbk) {
        int idx = data.indexOf(tkbk);
        if(idx >= 0)
            data.set(idx, tkbk);
            System.out.println("data telah berubah");

    }

    public void hapusData(String getidbuku) {
        int idx = data.indexOf(new TokoBuku(getidbuku, "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah terhapus");
        }
    }

    public void tampilkanData() {
        System.out.println("\n--= Data Buku =--");
        int urutan = 1;
        for (TokoBuku tkbk : data){
            System.out.println("data ke-" + urutan++);
            System.out.println("  ID BUKU    : " + tkbk.getidbuku());
            System.out.println("  NAMA BUKU  : " + tkbk.getNama());
            System.out.println("  HARGA BUKU : " + tkbk.getharga());
        }
    }

}