public class Main {
	public static void main(String[] args) {
		int nilai = 10;
		String pesan =" " , jumlah =" " ;
		 
		 if (nilai >2) {
		 	jumlah = "Lebih besar dari 2" ;
		 	if (nilai%2 == 0){
		 		pesan = "Bilangan Genap";
		 	}else{
		 		pesan = "Bilangan ganjil";
	}
	System.out.println(jumlah + " dan "+pesan);
	
}else {
	jumlah = "Lebih kecil dari 2";
	System.out.println(jumlah);
}
	}
}