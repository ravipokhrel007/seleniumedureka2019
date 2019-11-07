package Day10;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingBasics {
  @Test(priority=3)
  public void testcase1() {
	  System.out.println("Executing test case 1 and p = 3");
  }
  @Test(priority=1)
  public void testcase6() {
	  System.out.println("Executing test case 6 and p = 1");
  }
  @Test(priority=2)
  public void testcase3() {
	  System.out.println("Executing test case 3 and p = 2");
  }
  @Test(priority=-4, enabled=true)
  public void testcase5() {
	  System.out.println("Executing test case 5 and p = 4");
  }
  @BeforeMethod
  
  public void beforeATestcase() {
	  System.out.println("Executing before a test case");
  }
  @AfterMethod
 
  public void afterATestcase() {
	  System.out.println("Executing after a test case");
}
  @BeforeClass
  public void beforeAClass() {
	  System.out.println("Executing before a class test case");
  }
  @AfterClass
  public void afterAClass() {
	  System.out.println("Executing after a class test case");
  }
  
  
}