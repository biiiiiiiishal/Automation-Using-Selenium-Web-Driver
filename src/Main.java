import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xo\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://test.sharebus.co/");

        //signin click

        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div/ul/li/button"));

        signInButton.click();

        //login details input

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("brainstation23@yopmail.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Pass@1234");

        //login click

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/form/div[4]/button"));
        loginButton.click();

        //menubutton
        WebElement menuButton = driver.findElement(By.xpath("//*[(@id = \"navbarScrollingDropdown\")]"));
        menuButton.click();

        //selecting sharelead
        WebElement selectButton = driver.findElement(By.xpath("/html/body/div[1]/nav/div/ul/li/ul/li[3]/button"));
        selectButton.click();

        //selecting continue
        WebElement selectContinue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/button"));
        selectContinue.click();

        //setupsharebus
        WebElement selectSharebus = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[22]/button"));
        selectSharebus.click();

        //trip details
        WebElement inputFrom = driver.findElement(By.id("startPoint"));
        inputFrom.sendKeys("Oslo, Norway");

        WebElement inputTO = driver.findElement(By.id("startPoint"));
        inputTO.sendKeys("Kolbotn, Norway");

        WebElement clickContinue = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div/form/div[2]/button[2]"));
        clickContinue.click();

        //membership

        WebElement clickYES = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[1]/button[1]"));
        clickYES.click();

        //selectclubteam
        WebElement selectCLUB = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[1]/i"));
        selectCLUB.click();

        //selectclubname
        WebElement selectCLUBNAME = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[2]/ul/li[4]"));
        selectCLUBNAME.click();

        //clickcontinue
        WebElement clickContinuee = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[2]/button[2]"));
        clickContinuee.click();

        //need ticket for yourself
        WebElement clickNEEDNO = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/button[2]"));
        clickNEEDNO.click();

        //need discount-no
        WebElement needDiscount = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/button[2]"));
        needDiscount.click();

        //createShareBus
        WebElement createSHAREBUS = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[5]/button[2]"));
        createSHAREBUS.click();

        //Publish
        WebElement clickPublish = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[4]/button"));
        clickPublish.click();


        //tripname
        WebElement tripNAME = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/form/div[1]/div"));
        tripNAME.sendKeys("Visiting new place");


        //Catagory
        WebElement selectVacation = driver.findElement(By.id("vacation3"));
        selectVacation.click();

        //Preview and publish
        WebElement selectPreview = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[5]/button"));
        selectPreview.click();

        //final publish
        WebElement selectPublish = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[5]/button"));
        selectPublish.click();

        //My buses

        WebElement myBuses = driver.findElement(By.xpath("/html/body/div[1]/nav/div/ul/li[1]/button"));
        myBuses.click();








        

    }
}