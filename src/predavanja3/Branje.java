
import java.util.*;

public class Branje {

  public static void main(String[] args) {
    // za branje podatkov iz tipkovnice potrebumem objekt
    // razreda Scanner, ki ga povezem z System.in
    Scanner sc = new Scanner(System.in);

    int stevilo;
    System.out.print("Vpisi stevilo: ");
    // z uporabo objekta sc preberem stevilo iz tipkovnice
    stevilo = sc.nextInt();

    System.out.println("Vpisal si: " + stevilo);

  }
}
