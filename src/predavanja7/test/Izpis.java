package predavanja7.test;

/**
 * Razred, ki ga uporabim za demonstracijo poganjanja iz lupine.
 * Pri klicu moramo obvezno podati ime celotnega razreda:
 * 
 *   java predavanja7.test.Izpis
 *
 * @author tomaz
 */
public class Izpis {
  public static void main(String[] args) {
    if (args.length == 2) {
      int    n   = Integer.parseInt(args[0]);
      String msg = args[1];
    
      for (int i = 0; i < n; i++) {
        System.out.println(msg);  
      }
    } else {
      System.out.println("Program potrebuje dva argumenta");
    }
  }
}
