package Pages;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class myFinalProject {
	WebDriver driver;
    Random rand = new Random(); 
    public myFinalProject(WebDriver thedriver) {
        this.driver = thedriver;
    }
    By myAccountPage = By.partialLinkText("My Accou");
    public void Actions () {
   	 driver.findElement(myAccountPage).click();
    }
}

