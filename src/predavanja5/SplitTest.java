package predavanja5;

/**
 * Metoda split() razbije niz glede na podano locilo.
 * @author tomaz
 */
public class SplitTest {
  public static void main(String [] args) {
    String niz = "5,7,12";
    
    String [] deli = niz.split(",");
    for(int i=0; i<deli.length; i=i+1) {
      System.out.println(deli[i]);
    } 
  }
}
