package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Before;
//import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    /**
     * An initial test
     */
  @Test
  public void count7Test1(){
    assertEquals(2, Recursion.count7(717));
  }
  @Test
  public void count7Test2() {
    assertEquals(1, Recursion.count7(7));
  }
  @Test
  public void count7Test3() {
    assertEquals(0, Recursion.count7(123));
  }

  @Test
  public void changePiTest1() {
    assertEquals("x3.14x", Recursion.changePi("xpix"));
  }
  @Test
  public void changePiTest2() {
    assertEquals("3.143.14", Recursion.changePi("pipi"));
  }
  @Test
  public void changePiTest3() {
    assertEquals("3.14p", Recursion.changePi("pip"));
  }
  @Test
  public void changePiTest4() {
    assertEquals("iiipp3.143.143.14iip3.14ii", Recursion.changePi("iiipppipipiiippiii"));
  }
    
  @Test
  public void array220Test1(){
    int[] arr = {1, 2, 20};
    assertEquals(true, Recursion.array220(arr, 0));
  }
  // add more tests
}

/*
* javac -d bin src/recursionAssignment/Recursion.java
* 
* javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/recursionAssignment/RecursionTest.java 
*
* java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c recursionAssignment.RecursionTest
*/