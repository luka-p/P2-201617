package predavanja6;

/**
 * Kodiranje nizov s pomočjo metod razreda {@link predavanja6.Kodiranje} in 
 * metod {@link predavanja6.Kodiranje#kodiraj(java.lang.String)} in 
 * {@link predavanja6.Kodiranje#odkodiraj(java.lang.String)}.
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
