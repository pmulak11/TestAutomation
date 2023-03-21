import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

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
        Thread.sleep(2000);
        WebElement emailButton = driver.findElement(By.name("et_builder_submit_button"));
        emailButton.click();
        Thread.sleep(2000);
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
    @Test
    public void testCheckBox() {
        WebElement bikeCheckBox = driver.findElement(By.xpath("//*[@id='post-909']/div/div[1]/div/div[3]/div/div[1]/div[8]/div/div/div/form/input[1]"));
        bikeCheckBox.click();
        WebElement carCheckBox = driver.findElement(By.xpath("//*[@id='post-909']/div/div[1]/div/div[3]/div/div[1]/div[8]/div/div/div/form/input[2]"));
        carCheckBox.click();
        Assertions.assertTrue(bikeCheckBox.isSelected());
        Assertions.assertTrue(carCheckBox.isSelected());
    }
    @Test
    public void testDropDown() {
        Select carDropDown = new Select(driver.findElement(By.xpath("//*[@id='post-909']/div/div[1]/div/div[3]/div/div[1]/div[9]/div/div/div/select")));
        carDropDown.selectByVisibleText("Saab");
        Assertions.assertEquals("Saab", carDropDown.getFirstSelectedOption().getText());
    }
    @Test
    public void testLink() {
        WebElement link = driver.findElement(By.name("clickableLink"));
        link.click();
        WebElement linkSuccess = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals("Link success", linkSuccess.getText());
    }

}
