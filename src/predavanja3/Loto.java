
import java.util.*;

// Izpis sedmih loto stevil (stevila med 1 in 39)
public class Loto {

  public static void main(String[] args) {
    int stevilo;

    // ustvarim objekt razreda Random
    Random rnd = new Random();

    // 7-krat ustvarim in izpisem nakljucno stevilo
    for (int i = 1; i <= 7; i = i + 1) {
      // z uporaba objekta rnd generiram nakljucno stevilo med 1 in 39
      stevilo = 1 + rnd.nextInt(39);

      System.out.printf("%02d\n", stevilo);
    }
  }

}
