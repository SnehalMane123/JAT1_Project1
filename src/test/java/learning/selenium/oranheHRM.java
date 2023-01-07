package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oranheHRM {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//TC_Login_02
	WebElement userName1 = driver.findElement(By.xpath("//form[@class='oxd-form']/div[1]/div/div[2]/input"));
	userName1.sendKeys("admin");
	WebElement password1= driver.findElement(By.xpath("//form[@class='oxd-form']/div[2]/div/div[2]/input"));
	password1.sendKeys("passw123");
	WebElement login1= driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]/button"));
	login1.click();

	
	//TC_Login_01
	Thread.sleep(3000);
	WebElement userName = driver.findElement(By.xpath("//form[@class='oxd-form']/div[1]/div/div[2]/input"));
	userName.sendKeys("admin");
	WebElement password= driver.findElement(By.xpath("//form[@class='oxd-form']/div[2]/div/div[2]/input"));
	password.sendKeys("admin123");
	WebElement login= driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]/button"));
	login.click();
	
	
	//TC_PIM_01
	Thread.sleep(3000);
	WebElement pim = driver.findElement(By.xpath("//span[text()='PIM']"));
	pim.click();
	Thread.sleep(3000);
	WebElement add= driver.findElement(By.xpath("//div[@class='orangehrm-paper-container']/div/button"));
	add.click();
	Thread.sleep(3000);
	WebElement firstName= driver.findElement(By.xpath("//div[@class='--name-grouped-field']/div[1]/div[2]/input"));
	firstName.sendKeys("Ram");
	WebElement middleName= driver.findElement(By.xpath("//div[@class='--name-grouped-field']/div[2]/div[2]/input"));
	middleName.sendKeys("xcd");
	WebElement lastName= driver.findElement(By.xpath("//div[@class='--name-grouped-field']/div[3]/div[2]/input"));
	lastName.sendKeys("xcd");
	driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]")).click();
	
	//TC_PIM_02
	Thread.sleep(3000);
	WebElement employeeList = driver.findElement(By.xpath("//a[text()='Employee List']"));
	employeeList.click();
	WebElement edit = driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']/button[2]/i"));
	edit.click();
	WebElement middleName1= driver.findElement(By.xpath("//div[@class='--name-grouped-field']/div[2]/div[2]/input"));
	middleName1.sendKeys("xcd");
	driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[1]")).click();
	
	//TC_PIM_03
	Thread.sleep(3000);
	WebElement employeeList1 = driver.findElement(By.xpath("//a[text()='Employee List']"));
	employeeList1.click();
	Thread.sleep(3000);
	WebElement delete = driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']/button[1]/i"));
	delete.click();
	
	
	
	}
}
