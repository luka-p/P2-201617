// Prvi program - izracun in izpis obresti 
// na glavnico ob dani obrestni meri in dobi 
// varcevanja.

public class Obresti {

  public static void main(String[] args) {
    double G;         // Glavnica
    G = 1000;         // inicializacija G

    double p = 5;     // Obrestna mera
    int n = 10;    // stevilo let

    // Razultat izracunam po obrestno-obrestnem racunu
    double rezultat = G * Math.pow(1 + p / 100, n);

    // Izpis s pomocjo metode println()
    System.out.println("Glavnica:         " + G);
    System.out.println("Obrestna mera:    " + p);
    System.out.println("Stevilo let:      " + n);
    System.out.println("Stanje na racunu: " + rezultat);
  }
}
