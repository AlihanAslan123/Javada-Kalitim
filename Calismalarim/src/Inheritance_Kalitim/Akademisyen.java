package Inheritance_Kalitim;

public class Akademisyen extends Calisan{
	
	//simdi Akademisyene özel değişkenleri yazalım.
	private String bolum;
	private String unvan;

	public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
		super(adSoyad, telefon, eposta); // super metodu en üstte olmalıdır yoksa hata verir.
		this.bolum=bolum;
		this.unvan=unvan;
	}
	
	// yazdığımız değişkenlerli kapsülleyelim.
	public String getBolum() {
		return this.bolum;
	}
	public void setBolum(String bolum) {
		this.bolum=bolum;
	}
	
	public String getUnvan() {
		return this.unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan=unvan;
	}
    
	public void derseGir() {
		System.out.println(this.getAdSoyad()+" derse giriş yaptı.");
	}
	
}