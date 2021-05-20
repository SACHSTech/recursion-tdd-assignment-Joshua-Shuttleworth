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
  public void Test1(){
    assertEquals(2, Recursion.count7(717));
  }
  @Test
  public void Test2() {
    assertEquals(1, Recursion.count7(7));
  }
  @Test
  public void Test3() {
    assertEquals(0, Recursion.count7(123));
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