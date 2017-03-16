package predavanja4;

/**
 *
 * @author tomaz
 */
public class Nizi {
  public static void main(String[] args) {
    String niz1 = "To je niz";
    String niz2 = new String("To je niz");
    String niz3 = "To je niz";
    
    
    if (niz1 == niz2) {  /// ta primerjava NI OK!!!!
      System.out.println("JA");
    }
    
    // za primerjavo nizov VEDNO uporabljam metodo equals!!!!!
    if (niz1.equals(niz2)) {
      System.out.println("Da, niza sta enaka!");
    }
    
    
    String a = "to je niz";
    String b = "To Je Niz";
    
    // ce velikost znakov ni pomembna, lahko uporabim 
    // metodo compareToIgnoreCase ...
    if (a.compareToIgnoreCase(b) == 0)
      System.out.println("Sta enaka!");
    else
      System.out.println("Nista enak!");

    // ... ali equalsIgnoreCase
    if (a.equalsIgnoreCase(b))
      System.out.println("Sta enaka!");
    else
      System.out.println("Nista enak!");
    

    // niz "abc:def" bi radi razbili na dva dela - na del 
    // pred dvopicjem in del po dvopicju
    String niz5 = "abc:def";
    int kje = niz5.indexOf(":");    
    String predDvopicjem = niz5.substring(0, kje);
    String zaDvopicjem   = niz5.substring(kje+1);
    System.out.println(predDvopicjem);
    System.out.println(zaDvopicjem);
    
    System.out.println(zaDvopicjem.length());
    
  }
}
