package Inheritance_Kalitim;

public class OgretimGorevlisi extends Akademisyen{ //Akademisyen sınıfından miras alıcaz oda Calisandan miras alıyor.

	private String kapiNo;
	
	//Akademisyen sınıfının istediği parametreleri Counstructorda veriyoruz.
	public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
		super(adSoyad, telefon, eposta, bolum, unvan);
		this.kapiNo = kapiNo;
	}
	
	public String getKapiNo() {
		return this.kapiNo;
	}
	public void setKapiNo(String kapiNo) {
		this.kapiNo=kapiNo;
	}

}
