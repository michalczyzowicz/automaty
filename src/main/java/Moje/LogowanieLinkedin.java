package Moje;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogowanieLinkedin {

	
	@FindBy (id = "login-email")
	private WebElement email;
	@FindBy (id = "login-password")
	private WebElement password;
	@FindBy (id = "login-submit")
	private WebElement submit;
	@FindBy (className = "error")
	private List<WebElement> error;
	@FindBy (id = "mynetwork-tab-icon")
	private WebElement logo;
	@FindBy (css = ".ember-text-field")
	private WebElement setPeople;
	@FindBy (id = "nav-search-controls-wormhole")
	private WebElement search;
	@FindBy (xpath = "//*[@class='search-result__result-link ember-view']")
	private WebElement people;
	@FindBy (xpath = "//*[@class='message primary ember-view']")
	private WebElement message;
	@FindBy (xpath = "//*[@class='ember-text-area msg-messaging-form__message msg-messaging-form__message--chat ember-view']")
	private WebElement setMessage;
	
	
	
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void submit() {
		submit.click();
	}
	
	public void clearForm() {
		email.clear();
		password.clear();
	}
	
	public List<String> getErrors(){
		List<String> errorMessages = new ArrayList<String>();
		for(WebElement e:error){
			errorMessages.add(e.getText());
		}
		return errorMessages;
	}
	
	public WebElement allow(){
		return logo;
	}
	
	public void setPeople(String people) {
		this.setPeople.sendKeys(people);
	}
	
	public void submit2() {
		search.click();
		
	}
	
	public WebElement people() {
		return people;
	}
	
	public void clickPeople() {
		people.click();
	}
	
	public void message() {
		message.click();
	}
	
	public void setMessage(String message) {
		this.setMessage.sendKeys(message);
	}
	
	public void submit3() {
		setMessage.submit();
	}
}
