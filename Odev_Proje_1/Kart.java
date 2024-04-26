/**
 * Bu sınıf sayesinde her bir kartın türü ve özelliği tutuluyor.
 * @author Bengü Demireğen
 */

public class Kart {
	private String tur;
	private String ozellik;
	private int KartNumarasi;
	
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public String getOzellik() {
		return ozellik;
	}
	public void setOzellik(String ozellik) {
		this.ozellik = ozellik;
	}
	public int getKartNumarasi() {
		return KartNumarasi;
	}
	public void setKartNumarasi(int kartNumarasi) {
		KartNumarasi = kartNumarasi;
	}
	/**
	 * Yapıcı sayesinde kart için gerekli değişkenleri oluşturduk
	 * @param KartNumarasi
	 * @param tur
	 * @param ozellik
	 * @author Bengü Demireğen
	 */
	public Kart(int KartNumarasi,String tur,String ozellik) 
	{
		
	this.KartNumarasi=KartNumarasi;
	this.tur=tur;
	this.ozellik=ozellik;
	}	
	/**
	 * Deste sınıfında tüm desteyi yazdırmak istediğimizde for döngüsü içerisinde teker teker kart bilgilerini vermektedir.
	 * @return tur, ozellik
	 * @author Bengü Demireğen
	 */
	public String KartIsim()
	{ 
	return tur + " "+ ozellik;
	}
}
