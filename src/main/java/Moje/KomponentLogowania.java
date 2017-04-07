package Moje;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KomponentLogowania {

	@FindBy (id = "email")
	private WebElement email;
	@FindBy (id = "password")
	private WebElement password;
	@FindBy (id = "login")
	private WebElement submit;
	@FindBy (className = "login_form_error")
	private List<WebElement> errors;
	@FindBy (className = "avatar_header")
	private WebElement allow;
	@FindBy (xpath = "//*[@id='head-top']/div[2]/div[4]/a")
	private WebElement exit;
	@FindBy (css = ".login_tc_header")
	private WebElement logo;
	
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clearForm() {
		email.clear();
		password.clear();
	}
	
	public void submit() {
		submit.click();
	}
	
	public List<String> getErrors(){
		List<String> errorMessages = new ArrayList<String>();
		for(WebElement e:errors){
			errorMessages.add(e.getText());
		}
		return errorMessages;
	}
	
	public WebElement allow(){
		return allow;
	}
	
	public void signOut(){
		exit.click();
	}
	
	public WebElement doneExit() {
		return logo;
	}
}
