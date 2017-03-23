package predavanja5;

/**
 *
 * @author tomaz
 */
public class IfTest {
  static int i=1;
  
  static int zmansaj() {
    i = i-1;
    return i;
  }
  
  public static void main(String[] args) {
    int a=3;
    // preverjanje pogojev gre od leve proti desni in
    // se konca, ko je rezultat znan (ce je rezultat znan 
    // ze pred koncem pogoja, se preostanek pogoja sploh 
    // ne obravnava)
    if ((a==2 && zmansaj() > 0) || true)
      System.out.println("DA");
    
    System.out.println(i);
  }
}
