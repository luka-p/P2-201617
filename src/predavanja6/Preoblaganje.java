package predavanja6;

/**
 *
 * @author tomaz
 */
public class Preoblaganje {
  
  static void izpisi(int n, String msg) {
    for (int i = 0; i < n; i++) 
      System.out.print(" ");
    System.out.println(msg);
  }
  
  static void izpisi(int n) {
    izpisi(n, "Napaka!");
  }
  
  static void izpisi(String msg) {
    izpisi(10, msg);
  }  
  
  static void izpisi() {
    izpisi(15, "Napaka!");
  }
  
  
  
  public static void main(String[] args) {
    izpisi(7, "Tralala!");
    
    izpisi(15);
    
    izpisi();
    
    izpisi("Opozorilo");
  }

}
