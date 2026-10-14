package Alert;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertHandle {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();  // Simple Alert
        Alert alert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + alert.getText());  // Get alert text
        alert.accept();  // Click OK
        
        Thread.sleep(2000);
     // Alert with OK and Cancel (Confirmation Alert)
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();  // Confirmation Alert
        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println("Confirmation Alert Text: " + confirmationAlert.getText());  // Get alert text
        confirmationAlert.accept();  // Click OK
        confirmationAlert.dismiss();  // To click Cancel
        
        Thread.sleep(2000);
     // Alert with a Textbox (Prompt Alert)
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();  // Prompt Alert
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert Text: " + promptAlert.getText());  // Get alert text
        promptAlert.sendKeys("Hello!");  // Enter text in the textbox
        promptAlert.accept();  // Click OK
        
        
       //driver.quit(); // Close the browser
    }
}
