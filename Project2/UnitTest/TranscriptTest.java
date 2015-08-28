package Test;

import org.junit.* ;
import static org.junit.Assert.* ;

public class TranscriptTest {

   @Test
   public void substraction_helper() {
      System.out.println("Test if the substraction return correct result...") ;
      Transcript C = new Transcript() ;
      assertEquals(C.substraction(10, 10), 0, 0) ;
   }
   
   @Test
   public void calculate_helper() {
      System.out.println("Test if the calculate return correct result...") ;
      Calculator C = new Calculator() ;
      assertEquals(C.calculate(100, '/', 10), 10, 0) ;
   }

}