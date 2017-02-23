// Malenkost popravljen program Obresti.java:
// spremenil sem izpis - namesto metode println()
// sem uporabil metodo printf()
public class ObrestiB {

  public static void main(String [] args) {
  	double G;         // Glavnica
  	G = 1000;         // inicializacija G

  	double p = 5;     // Obrestna mera
  	int    n = 10;    // stevilo let

  	double rezultat = G * Math.pow(1+p/100,n);

    // izpis z metodo printf()
  	System.out.printf("Glavnica:         %7.2f\n", G);
  	System.out.printf("Obrestna mera:    %7.2f\n", p);
  	System.out.printf("Stevilo let:      %7d\n",   n);
  	System.out.printf("Stanje na racunu: %7.2f\n", rezultat);
  }	

}