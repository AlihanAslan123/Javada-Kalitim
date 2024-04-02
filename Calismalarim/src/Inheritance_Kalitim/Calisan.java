package Inheritance_Kalitim;

public class Calisan {
	
	//Calisan sınıfı en üst sınıf olucak diğer sınıflar buradan miras alıcak.
	// Tüm sınıflarda ortak olan değişken ve metodları burada belirliyorum.
	
	private String adSoyad;
	private String telefon;
	private String eposta;
	
	public Calisan(String adSoyad,String telefon, String eposta) 
	{
		this.adSoyad=adSoyad;
		this.telefon=telefon;
		this.eposta=eposta;
	}
	
	public String getAdSoyad() {
		return this.adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad=adSoyad;
	}
	
	public String getTelefon() {
		return this.telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon=telefon;
	}
	
	public String getEposta() {
		return this.eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	
	public void giris() {
		System.out.println(this.adSoyad+" üniversiteye giriş yaptı.");
	}
	public void cikis() {
		System.out.println(this.adSoyad+" üniversiteden çıkış yaptı.");
	}
	public void yemekhane() {
		System.out.println(this.adSoyad+" yemekhaneye giriş yaptı.");
	}

}
