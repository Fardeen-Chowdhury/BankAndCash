package Steps;


import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BankAndCashPage;
import page.BasePage;

public class BankAndCashStepDefination extends BasePage {
	BankAndCashPage bankAndCashPage;
	
	@Before
	public void beforeRun() {
		initDriver();
		bankAndCashPage = PageFactory.initElements(driver, BankAndCashPage.class);
		
	}

	@Given("^User is on Techfios login page$")
	public void user_is_on_Techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		bankAndCashPage.insertUserName(username);
	
	}
	
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		bankAndCashPage.insertPassword(password);
		
	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button()  {
		bankAndCashPage.clickSigninButton();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page()  {
		Assert.assertEquals("Dashboard- iBilling", bankAndCashPage.getPageTitle());
		
	}

	@Then("^User clicks on bankCash button$")
	public void user_clicks_on_bankCash_button()  {
		bankAndCashPage.clickBankandCashButton();
		
	}

	@When("^User clicks newAccount$")
	public void user_clicks_newAccount()  {
		bankAndCashPage.clickNewAccount();
	}

	@Then("^User enters accountTitle as \"([^\"]*)\"$")
	public void user_enters_accountTitle_as(String accounttitle)  {
		bankAndCashPage.insertAccountTitle(accounttitle + randTitle());
	}

	@Then("^User enters description as \"([^\"]*)\"$")
	public void user_enters_description_as(String description)  {
		bankAndCashPage.insertDescription(description);
	}

	@Then("^User enters initialBalance as \"([^\"]*)\"$")
	public void user_enters_initialBalance_as(String initialbalance) {
		bankAndCashPage.insertInitialBalance(initialbalance);
	}

	@Then("^User enters accountNumber as \"([^\"]*)\"$")
	public void user_enters_accountNumber_as(String accountnumber)  {
		bankAndCashPage.insertAccountNumber(accountnumber + randNum());
	}

	@Then("^User enters contactPerson as \"([^\"]*)\"$")
	public void user_enters_contactPerson_as(String contactperson) {
		bankAndCashPage.insertContactPersone(contactperson);
	}

	@Then("^User enters phoneNumber as \"([^\"]*)\"$")
	public void user_enters_phoneNumber_as(String phonenumber)  {
		bankAndCashPage.insertPhone(phonenumber);
		
	}

	@Then("^User enters internetBankingUrl as \"([^\"]*)\"$")
	public void user_enters_internetBankingUrl_as(String url) {
		bankAndCashPage.insertBankingUrl(url);
	}

	@Then("^User clicks on submit button$")
	public void user_clicks_on_submit_button() {
		bankAndCashPage.clickSubmitButton();
	}

	@Then("^User should be able to see validate new account created$")
	public void user_should_be_able_to_see_validate_new_account_created() {
		Assert.assertEquals("Accounts- iBilling", bankAndCashPage.getPageTitle());
	}
	
	@After
	public void afterRun() {
		tearDown();
	}
}
