
import java.util.*;

/*
 Demonstracija uporabe nakljucnih stevil
 */
public class Rnd1 {

  public static void main(String[] args) {

    Random rnd = new Random();

    // ce seme nastavim na 0, bo veckratna uporaba metode
    // nextInt() vracala vedno iste rezultate
    rnd.setSeed(0);

    int stevilo = rnd.nextInt();
    System.out.println(stevilo);

    stevilo = rnd.nextInt();
    System.out.println(stevilo);

    stevilo = rnd.nextInt();
    System.out.println(stevilo);
  }

}
