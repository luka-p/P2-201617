package predavanja6;

/**
 *
 * @author tomaz
 */
public class Racunalo {
  
  static int parseInt(String niz) {
    int x = 0;
    
    for (int i = 0; i < niz.length(); i++) {
      char z            = niz.charAt(i);
      int vrednostZnaka = z - '0';
      x = x * 10;
      x = x + vrednostZnaka;
    }
    
    return x;
  }
  
  public static void main(String[] args) {
    String niz = "135";
    int x = Racunalo.parseInt(niz);
    System.out.println(x);
  }

}
