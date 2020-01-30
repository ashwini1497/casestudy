package steps;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.java.en.Given;

	public class login {
		WebDriver driver;
		@Given("user launches chrome browsers")
		public void user_launches_chrome_browsers() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_C2A.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
		}

		@Given("user enters into tetme application")
		public void user_enters_into_tetme_application() {
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		}

		@Given("user clicks on signin link")
		public void user_clicks_on_signin_link() {
			driver.findElement(By.linkText("SignIn")).click();
		}

		@Given("user clicks on username as {string} in un field")
		public void user_clicks_on_username_as_in_un_field(String un) {
			driver.findElement(By.id("userName")).sendKeys(un);
		}

		@Given("user clicks on password as {string} in pwd field")
		public void user_clicks_on_password_as_in_pwd_field(String pwd) {
			driver.findElement(By.id("password")).sendKeys(pwd);

		}

		@Given("user clicks on login button")
		public void user_clicks_on_login_button() {
			driver.findElement(By.name("Login")).click();
		}



	}


