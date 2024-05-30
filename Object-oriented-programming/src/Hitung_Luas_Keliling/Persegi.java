package Hitung_Luas_Keliling;

public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int luas() {
        int hasil = this.sisi * this.sisi;
        return hasil;


    }
    public int keliling(){
        int hasil = 4 * this.sisi;
        return hasil;
    }
}
