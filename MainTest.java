import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

@Test
public void testNothing() {}

@Test
public void testSomeStuff() {
  assertEquals(2 + 3, 5);
  String s ="";
  assertNotNull("String is null", s);
  assertTrue(3*7 > 4*5 );
  
  }
}



