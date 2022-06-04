package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.Driver;

public class Q5_DragAndDrop {

    @Test(groups = {"grup1", "grup2"})
    public void test01() throws InterruptedException {
        DhtmlgoodiesPage dhtmlgoodiesPage=new DhtmlgoodiesPage();
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        // Fill in capitals by country.

        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(Driver.getDriver());
       actions.dragAndDrop(dhtmlgoodiesPage.copenak,dhtmlgoodiesPage.denmark)
               .dragAndDrop(dhtmlgoodiesPage.madrid,dhtmlgoodiesPage.spain)
               .dragAndDrop(dhtmlgoodiesPage.oslo,dhtmlgoodiesPage.norwey)
               .dragAndDrop(dhtmlgoodiesPage.seul, dhtmlgoodiesPage.southKorea)
               .dragAndDrop(dhtmlgoodiesPage.roma,dhtmlgoodiesPage.italy)
               .dragAndDrop(dhtmlgoodiesPage.washington,dhtmlgoodiesPage.usa)
               .dragAndDrop(dhtmlgoodiesPage.stocholm,dhtmlgoodiesPage.sweden)
               .perform();
Driver.closeDriver();
    }
}
