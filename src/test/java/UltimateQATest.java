import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UltimateQATest extends PageSetup {


    @Test
    public void testButton() {
        WebElement button = driver.findElement(By.id("idExample"));
        button.click();
        WebElement buttonSuccess = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals("Button success", buttonSuccess.getText());
    }
    @Test
    public void testTextBoxAndButton() throws InterruptedException {
        WebElement nameInput = driver.findElement(By.id("et_pb_contact_name_0"));
        nameInput.sendKeys("Pjoter");
        WebElement emailInput = driver.findElement(By.id("et_pb_contact_email_0"));
        emailInput.sendKeys("tester@test.com");
        Thread.sleep(1000);
        WebElement emailButton = driver.findElement(By.name("et_builder_submit_button"));
        emailButton.click();
        Thread.sleep(1000);
        WebElement thanksText = driver.findElement(By.xpath("//div[@class='et-pb-contact-message']/p"));
        Assertions.assertEquals("Thanks for contacting us", thanksText.getText());
    }
    @Test
    public void testRadioButton() {
        WebElement maleRadioButton = driver.findElement(By.xpath("//*[@id='post-909']/div/div[1]/div/div[3]/div/div[1]/div[7]/div/div/div/form/input[1]"));
        maleRadioButton.click();
        WebElement femaleRadioButton = driver.findElement(By.xpath("//*[@id='post-909']/div/div[1]/div/div[3]/div/div[1]/div[7]/div/div/div/form/input[2]"));
        femaleRadioButton.click();
        WebElement otherRadioButton = driver.findElement(By.xpath("//*[@id='post-909']/div/div[1]/div/div[3]/div/div[1]/div[7]/div/div/div/form/input[3]"));
        otherRadioButton.click();
        Assertions.assertFalse(maleRadioButton.isSelected());
        Assertions.assertFalse(femaleRadioButton.isSelected());
        Assertions.assertTrue(otherRadioButton.isSelected());
    }

}
