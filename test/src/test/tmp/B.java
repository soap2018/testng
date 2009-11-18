package test.tmp;

import org.testng.annotations.Test;

public class B {
  
  @Test(groups = "1")
  public void a1() {
    log("a1");
  }

  @Test(groups = "1")
  public void a2() {
    log("a2");
  }

  private void log(String string) {
    System.out.println(string + "() thread:" + Thread.currentThread().getId());
  }

  @Test(groups = "2", dependsOnGroups = "1")
  public void b1() {
    log("b1");
  }

  @Test(groups = "2", dependsOnGroups = "1")
  public void b2() {
    log("b2");
  }

  @Test(dependsOnGroups = "2")
  public void c1() {
    log("c1");
  }

  @Test(dependsOnGroups = { "1" })
  public void d() {
    
  }

  @Test
  public void x() {
    log("x");
  }

  @Test
  public void y() {
    log("y");
  }
  //  @Test(groups = "mytest", dependsOnMethods = "g")
//  public void f() {
//  }
//
//
//  @AfterMethod
//  public void after() {
//  }

}
