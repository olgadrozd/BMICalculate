import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BMICalculatorTest {
    @Test
    public void normalCategory() {
        //открыть https://healthunify.com/bmicalculator/
        // ввести Weight:
        // ввести Height
        // Click Calculate
        // Сравнить выведеное сообщение с ожидаемым
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("82");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal",
                "Категория не совпадает с ожидаемой");
        driver.quit();


    }
    @Test
    public void starvationCategory() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("50");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation",
                "Категория не совпадает с ожидаемой");
        driver.quit();

    }

    @Test
    public void underweightCategory() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("60");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight",
                "Категория не совпадает с ожидаемой");
        driver.quit();

    }

    @Test
    public void overweightCategory() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("90");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight",
                "Категория не совпадает с ожидаемой");
        driver.quit();

    }

    @Test
    public void obeseCategory() {
        //открыть https://healthunify.com/bmicalculator/
        // ввести Weight:
        // ввести Height
        // Click Calculate
        //
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("150");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Obese",
                "Категория не совпадает с ожидаемой");
        driver.quit();

    }
    @Test
    public void checkDropDown() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        Select dropdown = new Select(driver.findElement(By.name("opt1")));

        dropdown.selectByVisibleText("pounds");
        driver.quit();

    }}
