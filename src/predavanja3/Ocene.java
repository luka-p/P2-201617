
import java.util.*;

// Program iz tipkovnice bere stevila dokler uporabnik ne vpise stevila 0.
// Po koncanem branju program izpise povprecje vseh vpisanih stevil.
public class Ocene {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int stevilo;   // trenutno prebrano število
    int n = 0;	   // število prebranih števil
    int vsota = 0; // vsota prebranih števil

    // uporabimo zanko do, ker pred prvim branjem še ne moremo postaviti
    // izstopnega pogoja (se ne vemo, kaj bo uporabnik vpisal)
    do {
      stevilo = sc.nextInt();

      // ce je uporabnik vpisal stevilo, ki je razlicno od nic,
      // to stevilo pristejem vsoti in povecam stevec, ki steje
      // stevilo prebranih stevil
      if (stevilo != 0) {
        vsota = vsota + stevilo;
        n = n + 1;
      }

    } while (stevilo != 0);

    // pri deljenju je treba biti pozoren na dve stvari: 

    // a: na celostevilsko deljenje (kadar delimo dve celi stevili)
    // System.out.println(vsota / n); 

    // b: na deljenje z nic (pred deljenjem vedno preverim, ce je 
    // delitelj enek 0 in v tem primeru preprecim deljenje)
    if (n != 0) {
      System.out.printf("Povprecje: %.2f \n", 1.0 * vsota / n);
    } else {
      System.out.println("Ni bilo vpisanih ocen!");
    }

  }

}
