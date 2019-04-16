package hello;



import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;



   @Before

   public void setUp() throws Exception

   {

      g = new Greeter();

   }



   @Test

   public void testGreeterEmpty()

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Hello!");

   }



   @Test

   public void testGreeter()

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }

@Test
   public void RKGreeterPass(){

     g.setName("Ralph's Bungalow");
     assertEquals(g.getName(),"Ralph's Bungalow");
     assertEquals(g.sayHello(),"Hola Ralph's Bungalow!");
   }

   @Test
      public void RKGreeterFail(){

        g.setName("LaCasaMia");
        assertEquals(g.getName(),"Ralph's Bungalow");
        assertEquals(g.sayHello(),"Hola Dingus
      }

}
