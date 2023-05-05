import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class AddToCart {

    public static void addtoCart(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/zenex-airplane-toys-airbus-a380-plane-lights-sound-running-light-music/p/itmf813eb1628d8d?pid=MTYGMS8CWJBEYADD&lid=LSTMTYGMS8CWJBEYADDVOHNAP&marketplace=FLIPKART&q=Aeroplane&store=tng&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=210ef29e-8e21-4f4b-be29-1603ca51a7ce.MTYGMS8CWJBEYADD.SEARCH&ppt=sp&ppn=sp&ssid=3syavqzd8g0000001683272091955&qH=de52829dd983634c");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".\\_3v1-ww")).click();
        driver.findElement(By.cssSelector(".\\_3v1-ww")).click();

    }

    public static void main(String[] args){
        addtoCart();
    }
}
