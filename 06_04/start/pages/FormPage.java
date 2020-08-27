import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormPage {
    public class Form {
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/HomeUser/Downloads/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://formy-project.herokuapp.com/form");

            FormPage formPage = new FormPage();
            formPage.submitForm(driver);

            ConfirmationPage confirmationPage = new ConfirmationPage();
            confirmationPage.waitForAlertBanner(driver);

            assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

            driver.quit();
        }

    }
