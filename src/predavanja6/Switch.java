package predavanja6;

/**
 *
 * @author tomaz
 */
public class Switch {
  
  public static void main(String[] args) {
    int ocena = Integer.parseInt(args[0]);
    
//    if (ocena == 10)
//      System.out.println("ODLIČNO");
//    else if (ocena==9)
//      System.out.println("Prav dobro");
//    else if (ocena==8)
//      System.out.println("Prav dobro");
//    else if (ocena==7)
//      System.out.println("Dobro");
//    else 
//      System.out.println("...");
    
    switch (ocena) {
      case 10:
        System.out.println("ODLIČNO");
        break;
      case 9:
        System.out.println("Prav dobro");
        break;
      case 8:
        System.out.println("Prav dobro");
        break;
      case 7:
        System.out.println("Dobro");
        break;
      default:
        System.out.println("...");            
    }
  }

}
