import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMultipleSession {
//    static {
//        System.setProperty("webdriver.gecko.driver",
//                "C:\\Users\\mihovm.MASCORP\\Downloads\\selenium-java-3.141.59\\geckodriver.exe");
////                "/Users/balivo/Downloads/selenium/course/geckodriver");
//
//    }
    @Test
    public void executSessionOne() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mihovm.MASCORP\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
//                "/Users/balivo/Downloads/selenium/course/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
    }

    @Test
    public void executeSessionTwo() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mihovm.MASCORP\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
//                "/Users/balivo/Downloads/selenium/course/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
    }

    @Test
    public void executeSessionThree() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mihovm.MASCORP\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
//                "/Users/balivo/Downloads/selenium/course/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
    }
}
