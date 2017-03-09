
import java.io.*;

// Izpis veckratnikov nekega stevila v datoteko
public class Veckratniki {

	// Ker v metodi main uporabljam datoteke, v glavo metode
  // dodam "throws Exception"
  public static void main(String[] args) throws Exception {
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.print("Vpisi n: ");
    int n = sc.nextInt();

    System.out.print("Vpisi a: ");
    int a = sc.nextInt();

    System.out.print("Vpisi b: ");
    int b = sc.nextInt();

    // datoteko "veckratniki.txt" odprem za pisanje ... 
    PrintWriter pw = new PrintWriter("viri/veckratniki.txt");

    for (int i = a; i <= b; i = i + 1) {
      // ... vanjo v zanki zapisem vse veckratnike ...
      pw.printf("%2d * %2d = %3d\n", i, n, i * n);
    }

    // ... in jo na koncu (obvezno!) zaprem
    pw.close();

  }

}
