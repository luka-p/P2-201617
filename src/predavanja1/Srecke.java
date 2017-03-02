// Izpis tabele za izracun vrednosti srecke; 
// cena ene srecke: 1.25 EUR; 

public class Srecke {

  public static void main(String[] args) {
    // Glava tabele
    System.out.println("Stevilo sreck | Cena (EUR)");
    for (int i = 0; i < 26; i = i + 1) {
      System.out.print("-");
    }
    System.out.println();

    // Vrstice tabele
    for (int i = 1; i <= 10; i = i + 1) {
      System.out.printf("%5d         | %.2f \n", i, i * 1.25);
    }
  }
}
