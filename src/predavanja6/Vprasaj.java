package predavanja6;

/**
 *
 * @author tomaz
 */
public class Vprasaj {
  
  public static void main(String[] args) {
    double x = 36.1;
    
    if (x < 37)
      System.out.println("OK");
    else
      System.out.println("VROCINA");
    
    // spodnji ukaz naredi ISTO kot zgornje štiri vrstice
    System.out.println(x < 37 ? "OK":"VROCINA");
  }

}
