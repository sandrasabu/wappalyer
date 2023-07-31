package Examnact;

import org.openqa.selenium.chrome.ChromeDriver;

public class wapplayzer {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.wappalyzer.com");

    
    driver.findElement(By.xpath("//span[normalize-space()='Resources']")).click();

   
    driver.findElement(By.xpath("//div[@class='v-list-item__title subtitle-2'][normalize-space()='Technologies']")).click();


    driver.findElement(By.xpath("//span[@class='accent--text']")).click();

   
    driver.findElement(By.xpath("//span[normalize-space()='Create a lead list']")).click();

   
    WebElement technologiesDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("technologies")));
    Select selectTechnologies = new Select(technologiesDropdown);
    selectTechnologies.selectByVisibleText("Technologies");

  
}
}







}
