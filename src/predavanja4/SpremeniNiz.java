package predavanja4;

/**
 * Vsebina niza tipa String se na more spreminjati. Ce zelimo niz spreminjati, 
 * namesto String uporabimo StringBuffer ali StringBuilder.
 
 * Program demonstrira uporabo vseh treh razredov za dodajanje crk. Program meri
 * cas in pokaze, da je uporaba razreda String za veckratno dodajanje crk ZELO
 * pocasno, veliko hitreje je, ce uporabimo StringBuffer, se hitreje (ce ne potrebujemo
 * sinhronizacije za delo z nitmi) pa uporaba StringBuilderja.
 * 
 * @author tomaz
 */
public class SpremeniNiz {
  
  static String dodajCrkeVString(int n) {
    String rezultat = "";
    for (int i = 0; i < n; i++) {
      rezultat = rezultat + "a";
    }
    return rezultat;
  }
  
  static String dodajCrkeVStringBuffer(int n) {
    StringBuffer rezultat = new StringBuffer("");
    for (int i = 0; i < n; i++) {
      rezultat = rezultat.append("a");
    }
    return rezultat.toString();
  }

  static String dodajCrkeVStringBuilder(int n) {
    StringBuilder rezultat = new StringBuilder("");
    for (int i = 0; i < n; i++) {
      rezultat = rezultat.append("a");
    }
    return rezultat.toString();
  }
  
  
  
  public static void main(String[] args) {
    int N=100000;
    
    long cas1 = System.currentTimeMillis();
    String niz1 = dodajCrkeVString(N);
    cas1 = System.currentTimeMillis() - cas1;
    System.out.printf("Dodajanje %d znakov z uporabo razreda String traja %dms\n", N, cas1);
    
    long cas2 = System.currentTimeMillis();
    String niz2 = dodajCrkeVStringBuffer(N);
    cas2 = System.currentTimeMillis() - cas2;
    System.out.printf("Dodajanje %d znakov z uporabo razreda StringBuffer traja %dms\n", N, cas2);
    
    long cas3 = System.currentTimeMillis();
    String niz3 = dodajCrkeVStringBuilder(N);
    cas3 = System.currentTimeMillis() - cas3;
    System.out.printf("Dodajanje %d znakov z uporabo razreda StringBuilder traja %dms\n", N, cas3);    
  }
}
