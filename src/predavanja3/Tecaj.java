
import java.util.*;
import java.io.*;

// Program prebere vsebino datoteke, v kateri so zapisani tecaji CHF
// in izpise vrednosti najnizjega tecaja ter datum, ki je do tega 
// tecaja prislo
public class Tecaj {

  // "throws Exception" prepreci opozorila o izjemah (Exceptions)
  public static void main(String[] args) throws Exception {

    // imena datoteke NIKOLI ne podajam absolutno!!
    //Scanner sc = new Scanner(new File("c:\tomaz\datoteke\tecaj.txt"));
    //Scanner sc = new Scanner(new File("/home/tomaz/datoteke/tecaj.txt"));
    // vedno uporabim relativno ime datoteke
    Scanner sc = new Scanner(new File("viri/CHF2015.txt"));

    String datum;
    double tecaj;

    // obvezna inicializacija spremenjlivk
    double minTecaj = 100;
    String minDatum = "";

    // dokler imam se besedo, ki jo lahko preberem ...
    while (sc.hasNext()) {
      datum = sc.next();

      // ... in se eno stevilo, ki ga lahko preberem...
      if (sc.hasNextDouble()) {
        tecaj = sc.nextDouble();

    	  // ... preverim vrednost tecaja in ga, ce je manjsi od
        // najmanjsega do sedaj, shranim
        if (tecaj < minTecaj) {
          minTecaj = tecaj;
          minDatum = datum;
        }
      }
    }
    // obvezno zapiranje datoteke!
    sc.close();

    System.out.printf("MIN tecaj: %.4f (datum %s)\n", minTecaj, minDatum);
  }

}
