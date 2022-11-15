package kelimeOyunu;


public class Oyuncu {
    private int puan;
    private String name;

    public Oyuncu(String name) {
        this.name = name;
    }

    public void puanArttir(int puan){
        this.puan += puan;
    }

    public String getName(){
        return this.name;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public String toString(){
        return this.name;
    }
}