package predavanja4;

import java.util.*;

/**
 * Program premesa crke danega niza.
 * @author tomaz
 */
public class Anagram {
  static String anagram(String niz) {    
    Random rnd = new Random();
    
    // niz najprej pretvori v tabelo znakov
    char [] znaki = niz.toCharArray();
    
    // potem se sprehodi po vseh znakih in i-ti znak zamenja z nakljucnim j-tim znakom
    for(int i=0; i<niz.length(); i=i+1) {
      // ustvari nakljucni indeks j
      int j = rnd.nextInt(niz.length());
      
      // zamenjam i-to in j-to crko
      char z   = znaki[i];
      znaki[i] = znaki[j];
      znaki[j] = z;
    }
    
    return new String(znaki);
  }
  
  public static void main(String[] args) {
    String beseda = "BENJAMIN";
    System.out.println(anagram(beseda));
  }
}
