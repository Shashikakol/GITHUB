package Testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.generic_read_excel;
import POM.FacebookLogin;

public class Valid_login extends Base_Test
{
@Test
public void getLogged()
{
	String uname = generic_read_excel.getData("Sheet1", 0, 0);
	String pwd = generic_read_excel.getData("Sheet1", 0, 0);
	FacebookLogin fb = new FacebookLogin(driver);
	fb.setEmail(uname);
	fb.setPassword(pwd);
	fb.passbtn();

}
}
