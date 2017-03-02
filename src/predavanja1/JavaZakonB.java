// Malenkost spremenjen program JavaZakon.java:
// stevec i sem deklariral v (namesto pred) zanki.

public class JavaZakonB {

  public static void main(String[] args) {
    for (int i = 0; i < 17; i = i + 1) {
      System.out.println("Java je zakon!");
    }

    // Ker i "zivi" samo v zanki, ga po koncu 
    // zanke ne morem uporabiti!
    // System.out.println(i);
  }

}
