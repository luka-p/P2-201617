package predavanja6;

/**
 * To je razred za <b>kodiranje</b>, v njem sta definirani  metodi <code>kodiraj</code>
 * in <code>odkodiraj</code> ter splošna metoda <code>code</code>. 
 * 
 * @author tomaz
 * @version 1.0
 * @see Tajno
 */
public class Kodiranje {
  
  /**
   * Zamik pri kodiranju. Zamik je javen in ga lahko nastavimo tudi izven tega razreda.
   */
  public static int zamik = 3;

  /**
   * Metoda za kodiranje in odkodiranje (razlika je le v vrednosti zamika; pri 
   * pozitivnem zamiku gre za kodiranje, pri negativnem pa za odkodiranje).
   * 
   * @param niz niz, ki ga želimo kodirati
   * @param zamik velikost zamika za kodiranje (zamik=0 ... ni kodiranja!)
   * @return vrne zakodiran niz
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
  
  /**
   * Kodiranje niza s pomocjo Cezarjeve metode zamika
   * @param niz niz, ki ga želimo kodirati
   * @return kodiran niz
   */
  public static String kodiraj(String niz) {
    /*
      To je večvrstični komentar. 
      Pišem lahko v več vrstic.
    */
    return code(niz, zamik);
  }
  
  
  /**
   * Odkodiranje niza s pomocjo Cezarjeve metode zamika.
   * @param niz niz, ki ga želimo odkodirati
   * @return odkodiran niz
   */
  public static String odkodiraj(String niz) {
    return code(niz, -zamik);
  }
  

}
