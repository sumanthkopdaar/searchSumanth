import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SumanthTest {


        private WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver(); // Make sure ChromeDriver is set up correctly
        }

        @Test
        public void searchForSumanth() {
            driver.get("https://www.google.com");
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Sumanth");
            searchBox.submit();
            // Add assertions to validate search results
        }

//        @AfterMethod
//        public void tearDown() {
//            if (driver != null) {
//                driver.quit();
//            }
//        }
    }

