package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe"); // Example with iframe

        // Switch to iframe by its name or id (example: "iframeResult")
        driver.switchTo().frame("iframeResult");

        // Find an element inside the iframe (e.g., a heading)
        WebElement heading = driver.findElement(By.xpath("//h1"));
        System.out.println("Heading Inside iframe: " + heading.getText());

        // Perform any actions inside the iframe, such as clicking a button, filling a form, etc.
        // Example: Interacting with an element inside the iframe

        // Switch back to the main page (default content) after finishing tasks inside iframe
        driver.switchTo().defaultContent();

        // Interact with elements outside the iframe (on the main page)
        WebElement mainPageHeading = driver.findElement(By.xpath("//h1[contains(text(), 'W3Schools')]"));
        System.out.println("Main Page Heading: " + mainPageHeading.getText());

        driver.quit(); // Close the browser
    }
}
