package predavanja5;

import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class Biti {
  
  // Metoda vrne stevilo prizganih bitov v podanem pozitivnem stevilu
  static int steviloBitov(int x) {
    int biti =0; // stevec bitov
    
    // zanko ponavljam, dokler je x se pozitiven
    while (x > 0) { 
      // preverim prizganost zadnjega biti
      if ((x & 1) == 1)
        biti ++;
      
      // stevilo x "zasiftam" za 1 bit v desno (isto kot x = x/2)
      x = x >> 1;
    }
    
    return biti;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Vpisi stevilo: ");
    int x = sc.nextInt();
    
    System.out.println("Stevilo prizganih bitov: " + steviloBitov(x));
  }

}
