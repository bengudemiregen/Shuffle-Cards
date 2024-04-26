/**
 * İlk önce destemizi sırayla yazdırdıktan sonra destemizi karıştırıyoruz.
 * 13. satırdaki açıklamayı kaldırdığımız anda artık destemiz karıştırılmış bir şekilde ekrana basılacak.
 * @author Bengü Demireğen
 */
public class Test {

	public static void main(String[] args) {
	
		Deste a = new Deste();
			a.DesteYazdir();
			a.DesteyiKaristir();
		   a.DesteYazdir();
	}
}
