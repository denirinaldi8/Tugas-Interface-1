public class main implements Interface{
    public void cetak(){
        System.out.println("Cetak Nama Kedua");
	}	
	public static void main(String args[]){
		Interface a = new Interface();
		System.out.println(a.nama);
		System.out.println(a.nim);
		
		main b = new main();
		b.cetak();
	}
	
}