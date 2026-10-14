package all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class HandletabAndWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");

        //Store the main window handle
        String mainWindow = driver.getWindowHandle();

        //Click the "Open New Tab Window" button
        WebElement newTabButton = driver.findElement(By.xpath("//button[contains(text(),'click')]"));
        newTabButton.click();

        //Handle multiple tabs/windows
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                System.out.println("New Tab Title: " + driver.getTitle());
                driver.close();
            }
        }

        // Switch back to main window
        driver.switchTo().window(mainWindow);
        System.out.println("Back to Main Window: " + driver.getTitle());

        driver.quit();
    }
}
