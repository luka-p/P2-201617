package predavanja4;

/**
 *
 * @author tomaz
 */
public class Podatki {
  public static void main(String[] args) {
    // obicajna uporaba znakov
    char znak1 = 'T';
    System.out.println(znak1);
    
    // znak za crko Pi
    char znak2 = '\u03C0';
    System.out.println(znak2);
    
    // z znaki lahko tudi racunam
    char xt = 'A';
    xt = (char) (xt+5);
    System.out.println(xt);
    
    // ... jih med seboj odstevam
    int i = 'Z' - 'A';
    System.out.println(i);
    
    // ker je znak==stevilo, lahko formatu %c "podtaknem" tudi stevilo
    System.out.printf("%c\n", 'f');
    System.out.printf("%c\n",  960);
    
    char z1 = '\n';
    
    // znak \b zbrise izpisani znak
    System.out.print("ABCD");
    System.out.println("\b\bX");
    
    
    int x    = 123;    // stevilo 123
    System.out.println(x);
    int x8   = 0123;   // stevilo 123 po osmisko je 83 po desetisko
    System.out.println(x8);
    int x16  = 0x123;  // stevilo 123 po sestnajstisko je 291 po desetisko
    System.out.println(x16);
    
    
    
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);
    
  }
}
