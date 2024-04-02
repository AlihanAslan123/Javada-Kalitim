package Inheritance_Kalitim;

public class Main {

	public static void main(String[] args) {
		
		Calisan c1 = new Calisan("Ata Kara","0512121","mail@.com");
		
		//Akademisyen sınıfı calisan sınıfından miras aldığı için Calisan sınıfına ait metod ve değişkenleri kullanabiliyor.
		Akademisyen a1 = new Akademisyen("Lale Çelik","0582369","celik@mail.com","Edebiyat","Doçent");
		a1.cikis();
		a1.derseGir();
		
		Memur m1 = new Memur("Ali Veli","0542315","a@mail.com","Bilgi işlem","09:00 - 18:00");
		System.out.println(m1.getEposta()+" "+m1.getMesai()+" "+m1.getAdSoyad());
		
		OgretimGorevlisi o1 = new OgretimGorevlisi("Şükrü Beyaz","0254121","şkr@mail.com","Bilgisayar","Doçent","110");
		o1.giris();

	}

}
