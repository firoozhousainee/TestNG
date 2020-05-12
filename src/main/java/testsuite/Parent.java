package testsuite;

//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;               // can remove all and put a start below
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class Parent {
	
	
	@BeforeSuite
	public void bs() {
		System.out.println("### Before Suite");
		
	}
	
	@AfterSuite
	public void as() {
		System.out.println("### After Suite");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("### Before method");

}
	@AfterMethod
	public void am() {
		System.out.println("### After method");
		
}
}
