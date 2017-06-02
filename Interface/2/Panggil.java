public class Panggil implements Nama{
    public void nama1(){
        System.out.println("Cetak Nama Pertama");
    }
    public void nama2(){
        System.out.println("Cetak Nama Kedua");
    }
    public static void main(String[] args) {
        
        Panggil t = new Panggil();
        t.nama1();
        t.nama2();
    }
}