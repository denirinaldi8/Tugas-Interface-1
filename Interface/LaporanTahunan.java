public class LaporanTahunan implements CetakLaporan{
    public void cetak1(){
        System.out.println("Cetak Laporan Pertama");
    }
    public void cetak2(){
        System.out.println("Cetak Laporan Kedua");
    }
    public static void main(String[] args) {
        
        LaporanTahunan lt = new LaporanTahunan();
        lt.cetak1();
        lt.cetak2();
    }
}