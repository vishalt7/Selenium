import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAuto {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("search_query")).sendKeys("Selenium IDE Tutorials");
        driver.findElement(By.id("search-icon-legacy")).click();

        //String actUrl = driver.getCurrentUrl();
        //String expUrl = "https://www.youtube.com/results?search_query=UPES+DEHRADUN";



        //System.out.print(actTitle);

        //if (expUrl.equals(actUrl) == true){
            //System.out.println("Test Passed");
        //}
      //  else {
            //System.out.println("Test failed");
        //}


    }
}
