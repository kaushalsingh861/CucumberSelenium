package seleniumGlueCode;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {

    WebDriver driver;

    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() 
    {
        System.out.println("This Step open the Firefox and launch the application.");
        System.setProperty("webdriver.gecko.driver", "C:/Users/kaushal.singh/Downloads/geckodriver-v0.29.0-win64/geckodriver.exe");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @When("^Enter the Username and Password$")  
    public void enter_the_Username_and_Password()
    {
        System.out.println("This step enter the Username and Password on the login page.");
        driver.findElement(By.name("uid")).sendKeys("username12");
        driver.findElement(By.name("password")).sendKeys("password12");
        
    }

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("This step click on the Reset button.");
        driver.findElement(By.name("btnReset")).click();
    }

}
