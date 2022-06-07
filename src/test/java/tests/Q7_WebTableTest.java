package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Q7_WebTableTest {



    @Test
    public void test01() {

        //go to url : https://en.wikipedia.org/wiki/Dell

        Driver.getDriver().get("https://en.wikipedia.org/wiki/Dell");
        //go to table which name is 'List of companies acquired by Dell Inc.'

        //print row 4 of the table on console
        System.out.println(Driver.getDriver().findElement(By.xpath("(//tbody)[4]//tr[4]")).getText());
        //also print on console the 2nd and 3rd elements (middle 2 elements) in line 5
        System.out.println(Driver.getDriver().findElement(By.xpath("(//tbody)[4]//tr[5]//td[1]")).getText());
        System.out.println(Driver.getDriver().findElement(By.xpath("(//tbody)[4]//tr[5]//td[2]")).getText());
        //( 2nd and 3rd elements : November 2, Cloud integration leader)
        //  Verify that Compellent appears in the first cell of line 6
        String expectedText="Compellent";
        String actualText=Driver.getDriver().findElement(By.xpath("(//tbody)[4]//tr[6]//th")).getText();
        Assert.assertEquals(actualText,expectedText);
        //url'ye gidin: https://en.wikipedia.org/wiki/Dell
        // 'List of companies acquired by Dell Inc.' isimli tabloya gidin,
        // tablonun 4. satırını konsolda yazdırın
        // ayrıca 5. satırdaki 2. ve 3. öğeleri (ortadaki 2 öğe) konsola yazdırın
        // ( 2nd and 3rd ogeler : November 2, Cloud integration leader)
        // 6. satirin ilk hucresinde Compellent yazisinin goruntulendigini dogrulayin

    }
}
