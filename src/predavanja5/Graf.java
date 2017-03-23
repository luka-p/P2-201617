package predavanja5;

/**
 * Risanje osnovnih matematicnih funkcij.
 * Program rise v dvo-dimenzionalno tabelo (zaslon), nato 
 * tabelo izpise. Velikost tabele je odvisna od W in H.
 * @author tomaz
 */
public class Graf {
  
  static final int W = 80;
  static final int H = 25;
  
  static char [][] zaslon = new char[H][W];  
  
  static void pocisti() {
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        zaslon[i][j] = ' ';
      }
    }
  }
  
  static void izpisi() {
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        System.out.print(zaslon[i][j]);
      }
      System.out.println();
    }
  }
  
  static void koorSistem() {
    for (int i = 0; i < W; i++) {
      zaslon[H/2][i] = '-';
    }
    for (int i = 0; i < H; i++) {
      zaslon[i][W/2] = '|';
    }
    zaslon[H/2][W/2] = '+';
    zaslon[H/2][W-1] = '>';
    zaslon[0][W/2]   = '^';
  }
  
  static void narisi() {
    double x1 = -3.14*2, x2 = 3.14*2;
    double y1 = -1,    y2 = 1;
    
    for (int i = 0; i < W; i++) {
      double x = (x2-x1)/(W-1)*i + x1;
      double y = Math.sin(x);
      
      int j =(int) Math.round((H-1) * (y-y1) / (y2-y1));
      
      if (j>=0 && j<H)
        zaslon[H-j-1][i] = '*';
    }
  }
  
  public static void main(String[] args) {
    pocisti();
    koorSistem();
    narisi();
    izpisi();
  }

}
