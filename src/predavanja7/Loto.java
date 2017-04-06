package predavanja7;

import java.util.*;

/**
 * Program za izpis 7 naključnih loto številk.
 * Pri tem program pazi, da se številke ne ponovijo, poleg 
 * tega pa jih izpiše v  urejenem vrstnem redu.
 * @author tomaz
 */
public class Loto {
  
  /**
   * Preprosta metoda za urejanje tabele števil (bubble sort)
   * @param tabela 
   */
  static void uredi(int [] tabela) {
    
    // n-krat ponovim:
    for (int j = 0; j < tabela.length; j++) {          
      // sprehod cez tabelo, primerjava sosednjih 
      // elementov in zamenjava (ce je potrebno)      
      for (int i = 0; i < tabela.length-1; i++) {
        if (tabela[i] > tabela[i+1]) {
            // zamenjava elementov na klasičen način
//          int tmp     = tabela[i];
//          tabela[i]   = tabela[i+1];
//          tabela[i+1] = tmp;
          
            // zamenjava z uporabo vsote
//          tabela[i]   = tabela[i+1] + tabela[i];          
//          tabela[i+1] = tabela[i]   - tabela[i+1];
//          tabela[i]   = tabela[i]   - tabela[i+1];                    
          
          // zamenjava z uporabo operacije xor
          tabela[i]   = tabela[i+1] ^ tabela[i];          
          tabela[i+1] = tabela[i]   ^ tabela[i+1];
          tabela[i]   = tabela[i]   ^ tabela[i+1];                    
          
          // opomba: vsi trije načini naredijo ISTo zamanjavo, 
          // zadnji je najhitrejši, prvi pa najbolj splošen
          // (drugi in tretji način delata samo pri številih, prvi
          // pa pri poljubnih podatkih)
        }
      }      
    }    
  }
  
  public static void main(String[] args) {
    Random rnd = new Random();
    
    int [] stevilke = new int[7];
    for (int i = 0; i < 7; i++) {

      boolean nasel; 
      // generiranje i-tega stevila ponavljam toliko časa, dokler
      // ni i-to generirano stevilo razlicno od vseh prejsnjih stevil
      do {
        // zgeneriram i-to število
        int x = rnd.nextInt(39)+1;
        nasel = false;
        for(int j=0; j<=i-1; j++) {
          if (stevilke[j] == x) 
            nasel = true;
        }
        if (!nasel)
          stevilke[i] = x;
      } while (nasel);    
    }
    
    uredi(stevilke);
    
    for (int i = 0; i < 7; i++) {
      System.out.println(stevilke[i]);
    }
  }

}
