import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class Week05c_RainyDaysTest {

   private static Week05c_RainyDays tester = null;
   private static ByteArrayOutputStream outContent = new ByteArrayOutputStream();

   @BeforeClass
     public static void setupBeforeTests() throws Exception {
      System.setOut(new PrintStream(outContent));
      tester = new Week05c_RainyDays();
   }

   @Test
    public void testNewMethodExists(){
      Class cls  = tester.getClass();
      try{
         Method m = cls.getMethod("getRainyPercentage", int.class, int.class);}
      catch(NoSuchMethodException e){
         fail("getRainyPercentage() not implemented.");
      }
   }
   
   @Test
   public void testBasic(){
      assertEquals("Fails given test case!", tester.getRainyPercentage(2012, 47) , 12.841530054644808 , 0.0001);
   }
   
   @Test
   public void testLeap(){
      assertEquals("Fails given test case!", tester.getRainyPercentage(2020, 97) , 26.502732240437158  , 0.0001);
   }
   
   @Test
   public void testNonLeapYear(){
      assertEquals("Fails for non- leap years!", tester.getRainyPercentage(2014, 14) , 3.835616438356164 , 0.0001);
   }
   
   @Test
   public void testMillinniumYear(){
      assertEquals("Fails for millinium years!", tester.getRainyPercentage(2000, 27) ,7.397260273972603  , 0.0001);
   }
}


