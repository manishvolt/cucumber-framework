package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {
        // changing the code 
	WebDriver driver;
	String ResultsTitle="Amazon.in : laptop";
	
	@Given("user opened browser")
	public void user_opened_browser() {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "D:\\Automation jars and softwares\\projects\\selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	}

	@Given("user launched site")
	public void user_launched_site() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.amazon.in");
	    
	}

	@When("user searched a product")
	public void user_searched_a_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait WebDriverwait=new WebDriverWait(driver, 20);
		WebElement SearchBox=WebDriverwait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		SearchBox.sendKeys("laptop");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(3000);
	   
	}

	@Then("results as per search conducted got dislayed")
	public void results_as_per_search_conducted_got_dislayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.getTitle();
		Assert.assertEquals(ResultsTitle, driver.getTitle());
		Thread.sleep(4000);
	}
	
    @When("user clicks on a product")
    public void user_clicks_on_a_product() {
		    // Write code here that turns the phrase above into concrete actions
    	WebDriverWait x =new WebDriverWait(driver, 20);
    	x.until(ExpectedConditions.elementToBeSelected(By.xpath("//span[contains(text(),'AVITA PURA NS14A6INU442-MEGYB 14-inch Laptop (AMD Ryzen 3-3200U/4GB/256GB SSD/FHD/Windows 10 Home in S Mode/AMD Radeon Vega 3 Graphics/MS Office 365/1.34Kg), Metallic Black with 3 in 1 Sleeve (Grey)')]")));
    	
    	    
    }

    @Then("product description is shown")
    public void product_description_is_shown() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("hello");
		}
	
	}


