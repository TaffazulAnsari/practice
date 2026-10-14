package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html"); // Sample URL for hover action

        // Find the element to hover over
        WebElement hoverElement = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

        // Create Actions object to perform mouse hover
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();  // Perform hover action

        // You can add a wait here to observe the effect of hover if needed
        // Thread.sleep(2000);  // Optional, to see hover effect in action

        ///driver.quit(); // Close the browser
    }
}
