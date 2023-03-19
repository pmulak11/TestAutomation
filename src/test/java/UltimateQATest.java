import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UltimateQATest extends PageSetup {


    @Test
    public void testOne() {
        WebElement button = driver.findElement(By.id("idExample"));
        button.click();
        WebElement buttonSuccess = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals("Button success", buttonSuccess.getText());
    }
}
