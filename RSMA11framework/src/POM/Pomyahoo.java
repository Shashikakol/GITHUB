package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomyahoo 
{
	@FindBy(xpath="//input[@id='login-username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='login-signin']")
	private WebElement nextBtn;
	
	@FindBy(xpath="//input[@id='login-passwd']")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(.,'Next')]")
	private WebElement btnNext;
	
	@FindBy(xpath="//div[@class='icon mail']")
	private WebElement mailIcon;
	
	@FindBy(xpath="//a[.='Compose']")
	private WebElement compose;
	
	@FindBy(xpath="//input[@id='message-to-field']")
	private WebElement toText;
	
	@FindBy(xpath="//input[@data-test-id='compose-subject']")
	private WebElement subject;
	
	@FindBy(xpath="//div[@aria-label='Message body']")
	private WebElement body;
	
	@FindBy(xpath="//button[@data-test-id='compose-send-button']")
	private WebElement sendButton;
	
	@FindBy(xpath="//span[@role='presentation']")
	private WebElement rolespam;
	
	@FindBy(xpath="//a[@data-soa='Sign out of all']")
	private WebElement snoutbutton;
	
	public Pomyahoo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void button1()
	{
		nextBtn.click();
	}
	public void button2()
	{
		btnNext.click();
	}
	public void icon()
	{
		mailIcon.click();
	}
	public void clickCompose()
	{
		compose.click();
	}
	public void to(String text)
	{
		toText.sendKeys(text);
	}
	public void sub(String text)
	{
		subject.sendKeys(text);
	}
	public void textBody(String text)
	{
		body.sendKeys(text);
	}
	public void send()
	{
		sendButton.click();
		
	}
	public void role()
	{
		rolespam.click();
	}
	public void signout()
	{
		snoutbutton.click();
	}
}
