package predavanja7;

import predavanja6.Kodiranje;

/**
 * Razrede in metode iz paketa predavanje6 lahko uporabimo 
 * tudi v drugih paketih. 
 * @author tomaz
 */
public class TestKodiranje {
  
  public static void main(String[] args) {
    predavanja6.Kodiranje.kodiraj("abc");
    
    
    // zaradi ukaza import, lahko razred uporabimo tudi brez predpone "predavanja6.".
    Kodiranje.odkodiraj("abc");
  }

}
