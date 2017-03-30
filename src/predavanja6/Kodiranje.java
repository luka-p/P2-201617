package predavanja6;

/**
 * To je razred za kodiranje.
 * @author tomaz
 */
public class Kodiranje {
  
  /**
   * Zamik pri kodiranju
   */
  public static int zamik = 3;

  /**
   * Genericna metoda za kodiranj.
   * @param niz to je prvi parameter
   * @param zamik to je drugi parameter
   * @return 
   */
  public static String code(String niz, int zamik) {
    String rezultat = ""; // spremenljivka za rezultat
    for (int i = 0; i < niz.length(); i++) {
      char znak = niz.charAt(i);
      char novZnak = (char) ('A' + (26 + znak - 'A' + zamik) % 26);
      rezultat += novZnak;
    }
    return rezultat;
  }

  
  static String kodiraj(String niz) {
    /*
      To je večvrstični komentar. 
      Pišem lahko v več vrstic.
    */
    return code(niz, zamik);
  }
  
  static String odkodiraj(String niz) {
    return code(niz, -zamik);
  }
  

}
