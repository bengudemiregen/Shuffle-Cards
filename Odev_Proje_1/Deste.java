import java.util.Random;

public class Deste {

	/**
	 * Her bir kartın özelliğini diziler sayesinde tuttuk. Değiştirilmemesi için final kullandım.
	 * @author Bengü Demireğen
	 */
	private final String[] tur= {"Maça","Karo","Kupa","Sinek"};
	private final String[] ozellik= {"As","Vale","Kız","Papaz","2","3","4","5","6","7","8","9","10"};
	private Kart[] kartlar; //dizi
	/**
	 * for döngüsü sayesinde her bir türün teker teker ve sırasıyla özellikleri atanır.
	 * @author Bengü Demireğen
	 */
	public Deste() {
		kartlar= new Kart[52];
	    int kartnumarasi=0;
		for(int i=0;i<tur.length;i++)
		{
			for(int j=0;j<ozellik.length;j++)
			{
				kartlar[kartnumarasi]=new Kart(kartnumarasi,tur[i],ozellik[j]);
				kartnumarasi++;
			}
		}
		}
	/**
	 * kartlar dizisindeki her bir kart sırasıyla yazdırılır. KartIsim() metodu sayesinde return olarak bilgileri alıyoruz.
	 * @author Bengü Demireğen
	 */
	public void DesteYazdir() {
		 for (Kart kart : kartlar) 	//kartlar dizisindeki her elemanı teker teker aldım.
		 {
	            if (kart != null) 	//null sorunu için if ekledim.İç içe döngü yüzünden bazı kartlar yazdırılmadı.
	            {
	                System.out.println("Kartın İsmi: " + kart.KartIsim());
	                System.out.println("------------------------------------");
	            }
	        }
    }
	/**
	 * Swap algoritması kullanarak desteyi karıştırdım. Burada rastgele indeksi random fonksiyonu sayesinde oluşturduk.
	 * @author Bengü Demireğen
	 */
 public void DesteyiKaristir() {
	        Random random = new Random();
	        for (int i = 0; i < kartlar.length; i++)
	        {
				int sayi = random.nextInt(kartlar.length); // 0-52 arası sayılardan rastgele birini seçecek ve sayıya atayacak
	            
	            								//swap (değiştirme) algoritmaları
	            Kart a = kartlar[i]; 			//dizinin i. elemanındaki bilgileri geçici bir değişkene atadım.
	            kartlar[i] = kartlar[sayi];		//mevcut olan kartın yerine rastgele seçilen kartın bilgileri atılır.
	            kartlar[sayi] = a;				//ilk başta mevcut olan kartın bilgileri atanır, kartların referansları ve bilgileri yer değiştirmiş olur.
	            
	        }
	      System.out.println("Kartlar Karıştırıldı.");
	    }
}

