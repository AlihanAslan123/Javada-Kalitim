package Inheritance_Kalitim;

public class Memur extends Calisan{
	
	// kendi sınıfına ait değişkenleri yazdım ortak olanları zaten Calisan sınıfından miras aldı.
	private String departman;
	private String mesai;
	
	// Constructor metoda parametre olarak Calisan sınıfının istediği parametreleri yazdık. ve Sonra kendi özel değişkenlerinide yazdık.
	public Memur(String adSoyad, String telefon, String eposta,String departman, String mesai) {
		super(adSoyad, telefon, eposta); // super ile bir üst sınıfa istediği parametreleri yolluyoruz.
		this.departman=departman;
		this.mesai=mesai;
	}

	public String getDepartman() {
		return this.departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public String getMesai() {
		return this.mesai;
	}

	public void setMesai(String mesai) {
		this.mesai = mesai;
	}
	
	public void Calis() {
		System.out.println(this.getAdSoyad()+" çalışmaya başladı.");
	}
	

}
