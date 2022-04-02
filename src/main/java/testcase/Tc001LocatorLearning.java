package testcase;

import base.DriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;


    public class Tc001LocatorLearning extends DriverSetup {
        String baseUrl= "https://rahulshettyacademy.com/locatorspractice/";
        @Test
        public void locatorLearning() throws InterruptedException {
            driver.get(baseUrl);
            Thread.sleep(2000);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            driver.findElement(By.id("inputUsername")).sendKeys("tazin");;
            driver.findElement(By.name("inputPassword")).sendKeys("12356677");
            driver.findElement(By.className("signInBtn")).click();
            System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
            driver.findElement(By.linkText("Forgot your password?")).click();
            driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("papel");
            //   //tagname[@attribute='value']
            driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("shaminazchytazin@gmail.com");
            //tagname[attribute='value']
            driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01813799673");
            driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-container']/button[1]")).click();
            driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Tanaz");
            driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
            driver.findElement(By.id("chkboxOne")).click();
            driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
            Thread.sleep(2000);

        }


    }

