package predavanja5;


import java.util.Scanner;
import java.io.File;

/**
 *
 * @author tomaz
 */
public class RjaviLasje {
  public static void main(String [] args) throws Exception {
    Scanner sc = new Scanner(new File("viri/studenti.txt"));
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      
      // System.out.println(vrstica);
      
      String [] deli = vrstica.split(":");
      String barva=deli[5].trim();
      //if (deli[5].trim().equals("RJAVA")) {
      if (barva.equals("RJAVA")) {
        System.out.println(deli[1]);
      }
      
    }
    sc.close();
  }

}
