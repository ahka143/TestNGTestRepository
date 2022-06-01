package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Q5_DragAndDrop {

    @Test
    public void test01() throws InterruptedException {

        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        // Fill in capitals by country.

        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(Driver.getDriver());
        WebElement washingtonElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='dragableBox'])[5]"));
        WebElement usaElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='dragableBoxRight'])[7]"));
        actions.dragAndDrop(washingtonElementi, usaElementi).perform();
        Thread.sleep(800);
        WebElement copenhagenElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='dragableBox'])[8]"));
        WebElement denmarkElementi = Driver.getDriver().findElement(By.xpath("//*[text()='Denmark']"));
        actions.dragAndDrop(copenhagenElementi, denmarkElementi).perform();
        Thread.sleep(800);
        WebElement stockholmElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='dragableBox'])[10]"));
        WebElement swedenElementi = Driver.getDriver().findElement(By.xpath("//*[text()='Sweden']"));
        actions.dragAndDrop(stockholmElementi, swedenElementi).perform();
        Thread.sleep(800);
        WebElement osloElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='dragableBox'])[14]"));
        WebElement norwayElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='dragableBoxRight'])[3]"));
        actions.dragAndDrop(osloElementi, norwayElementi).perform();
        Thread.sleep(800);
        WebElement seoulElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='dragableBox'])[11]"));
        WebElement southKoreaElementi = Driver.getDriver().findElement(By.xpath("//*[text()='South Korea']"));
        actions.dragAndDrop(seoulElementi, southKoreaElementi).perform();
        Thread.sleep(800);
        WebElement madridElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='dragableBox'])[12]"));
        WebElement spainElementi = Driver.getDriver().findElement(By.xpath("//*[text()='Spain']"));
        actions.dragAndDrop(madridElementi, spainElementi).perform();
        Thread.sleep(800);
        WebElement romeElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='dragableBox'])[13]"));
        WebElement italyElementi = Driver.getDriver().findElement(By.xpath("//*[text()='Italy']"));
        actions.dragAndDrop(romeElementi, italyElementi).perform();


    }
}
