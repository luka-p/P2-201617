package predavanja6;

/**
 *
 * @author tomaz
 */
public class Tajno {
  
  public static void main(String[] args) {
    String niz        = "TEST";
    
    Kodiranje.zamik = 5;
    
    
    String kodiranNiz = Kodiranje.kodiraj(niz);
    System.out.println(kodiranNiz);
    
    String odkodirano = Kodiranje.odkodiraj(kodiranNiz);
    System.out.println(odkodirano);
  }

}
