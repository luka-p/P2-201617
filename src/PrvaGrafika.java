
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author tomaz
 */
public class PrvaGrafika {
  
  /**
   * Izris ene črte
   */
  static void izris1() {
    StdDraw.line(0, 0, 1, 1);
  }
  
  /**
   * Izris nekaj razlicnih likov v različnih barvah
   */
  static void izris2() {
    //StdDraw.setXscale(-1, 1);
    //StdDraw.setYscale(-1, 1);    
    StdDraw.setScale(-1, 1);
    
    StdDraw.line(0, 0, 1, 1);
    StdDraw.circle(0, 0, 1);
    StdDraw.ellipse(0, 0, 1, 0.5);
    
    StdDraw.setPenRadius(0.01);
    StdDraw.line(-1, 1, 1, -1);
    
    StdDraw.setPenColor(Color.YELLOW);
    StdDraw.setPenColor(new Color(0xb2,0x00,0x4c));
    StdDraw.filledSquare(0, 0, 0.2);
    
    
  }
  
  /**
   * Izris spirale
   */
  static void izris3() {
    StdDraw.setScale(-1, 1);    
    
    double kot = 0;  // kot v stopinjah
    double r = 0.001;
    
    double deltaR   = 1.01;
    double deltaKot = 6;
    
    double pX=0, pY=0;
    
    for (int i = 0; i < 1000; i++) {
      double x = r * Math.sin(2*Math.PI*kot/360);
      double y = r * Math.cos(2*Math.PI*kot/360);
      
      StdDraw.line(pX, pY, x, y);
      pX = x;
      pY = y;
      
      kot = kot + deltaKot;
      r = r*deltaR;
    }
    
  }

  /**
   * Izris krivulje y=sin(x). Če zelite izrisati druge krivilje, spremenite 
   * vrstico "double y = Math.sin(x);"
   */
  static void izris4() {
    int W = 100;
    int H = 100;
    StdDraw.setXscale(0, W);
    StdDraw.setYscale(0, H);
    
    double x1 = -3.14*6, x2 = 3.14*6;
    double y1 = -1,    y2 = 1;
    
    double pX=Double.MIN_VALUE, pY=Double.MIN_VALUE;
    
    for (int i = 0; i < W; i++) {
      double x = (x2-x1)/(W-1)*i + x1;
      double y = Math.sin(x);
      
      int j =(int) Math.round((H-1) * (y-y1) / (y2-y1));
      
      if (j>=0 && j<H)
        if (pX == Double.MIN_VALUE)
          StdDraw.line(i, j, i, j);
        else
          StdDraw.line(pX, pY, i, j);
      
      pX = i; pY = j;
    }

  }  
  
  /**
   * Pomozna metoda za izris enega kazalca.
   */
  static void kazalec(int dolzina, double debelina, double kot) {
    double k = kot *2*Math.PI/360;
    double x = dolzina * Math.sin(k);
    double y = dolzina * Math.cos(k);        
    
    StdDraw.setPenRadius(debelina);
    StdDraw.line(0, 0, x, y);
  }
  
  /**
   * Izrisovanje trenutne ure. 
   */
  static void izris5() {
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
    
    while (true) {
      String ura = sdf.format(new Date());        
      StdDraw.setScale(-100, 100);
      StdDraw.clear();
      StdDraw.text(-90, 100, ura);
      
      String [] u = ura.split(":");
      int h = Integer.parseInt(u[0]);
      int m = Integer.parseInt(u[1]);
      int s = Integer.parseInt(u[2]);
      
      for (int i = 1; i <= 12; i++) {
        double kot = i*30 *2*Math.PI/360;
        double x   = 100 * Math.sin(kot);
        double y   = 100 * Math.cos(kot);        
        StdDraw.text(x, y, Integer.toString(i));
      }
      
      kazalec(90, 0.001, 6*s);
      kazalec(80, 0.01,  6*m);
      kazalec(60, 0.01,  30*(h+1.0*m/60));
      
      StdDraw.show(1000);
    }
  }

  
  public static void main(String[] args) {
    izris5();
  }
  

}
