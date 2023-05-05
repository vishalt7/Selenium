import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        driver.findElement(By.id("firstName")).sendKeys("Vishal");
        driver.findElement(By.id("lastName")).sendKeys("Thakur");
        driver.findElement(By.id("userEmail")).sendKeys("500084112@stu.upes.ac.in");
        driver.findElement(By.className("custom-control-label")).click();
        driver.findElement(By.id("userNumber")).sendKeys("6396062089");

        WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
        dob.sendKeys(Keys.COMMAND + "a");
        dob.sendKeys("26 Sep 2003");

        WebElement subject = driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("Maths");
        subject.sendKeys(Keys.ENTER);
        subject.sendKeys("Computer Science");
        subject.sendKeys(Keys.ENTER);


        //driver.findElement(By.xpath("//input[@text = 'Sports']")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//label[@text = 'Reading']")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("currentAddress")).sendKeys("Selakui, Dehradun, Uttarakhand-248011");

        driver.findElement(By.id("react-select-3-input")).sendKeys("Uttar", Keys.ENTER);
        driver.findElement(By.id("react-select-4-input")).sendKeys("Lucknow", Keys.ENTER);

        driver.findElement(By.id("submit")).sendKeys(Keys.ENTER);

        driver.quit();




    }
}
