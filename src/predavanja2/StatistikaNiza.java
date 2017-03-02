// Program izpise statistiko niza

public class StatistikaNiza {

	public static void main(String[] args) {
		String niz = "Danes je lep dan!";
		
		System.out.printf("Niz: %s\n", niz);
		System.out.printf("Prvi znak: %c\n", niz.charAt(0));
		System.out.printf("Prvi znak (s substring): %s\n", niz.substring(0,1) );
		System.out.printf("Zadnji znak: %c\n", niz.charAt(niz.length()-1));
		
		int indeksPresledka = niz.indexOf(" ");
		if(indeksPresledka == -1) {
			indeksPresledka = niz.length();
		}
		String prvaBeseda = niz.substring(0, indeksPresledka);
		System.out.printf("Prva beseda: %s\n", prvaBeseda);
		
		System.out.printf("Brez presledkov: %s\n", niz.replaceAll(" ", ""));
		System.out.printf("Brez presledkov (z replace): %s\n", niz.replace(" ", ""));
		System.out.printf("Dolzina niza: %d\n", niz.length());
		
		int steviloBesed = 1;
		for(int i = 0; i < niz.length(); i=i+1) {
			if(niz.charAt(i) == ' ') {
				steviloBesed = steviloBesed + 1;
			}
		}
		System.out.printf("Stevilo besed: %d\n", steviloBesed);
		
		System.out.printf("Obrnjen niz: ");
		for(int i = niz.length()-1; i >= 0; i=i-1) {
			System.out.printf("%c", niz.charAt(i));
		}
		System.out.println();
	}
}
