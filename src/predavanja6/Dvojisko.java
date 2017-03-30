package predavanja6;

/**
 *
 * @author tomaz
 */
public class Dvojisko {
  
  // pretvorba iz desetiskega v dvojiski sistem
  static String vDvojisko(int x) {
    String rezultat="";
    while (x > 0) {
      
      if ((x & 1) == 1)
        rezultat = "1" + rezultat ;
      else
        rezultat = "0" + rezultat;
      
      // rezultat = ((x & 1) == 1 ? "1" : "0") + rezultat;
      
      x = x >> 1;
    }
    return rezultat;
  }
  
  // pretvorba iz dvojiskega v desetiski sistem
  static int vDesetisko(String x) {
    int rezultat = 0;
    int b = 1;
    for (int i = x.length()-1; i >= 0; i--) {
      if (x.charAt(i) == '1')
        rezultat += b;
      b = b << 1;  // b = b * 2;
    }
    
    return rezultat;
  }
  
  public static void main(String [] args) {
    String dvojisko = vDvojisko(42);
    System.out.println(dvojisko);
    int desetisko = vDesetisko(dvojisko);
    System.out.println(desetisko);
    
    int c = vDesetisko("01000110");
    char crka = (char) c;
    System.out.println(crka);
  }

}
