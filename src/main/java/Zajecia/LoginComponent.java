package Zajecia;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginComponent {

	
		@FindBy(id = "email")
		private WebElement email;
		@FindBy(id = "password")
		private WebElement password;
		@FindBy(id = "login")
		private WebElement submit;
		@FindBy(className = "login_form_error")
		private List<WebElement> errors;
		@FindBy(className = "avatar_header")
		private WebElement allow;
		@FindBy(xpath = "//div[@class='login_form']/img")
		private WebElement captcha;


		public void setEmail(String email) {
		this.email.sendKeys(email);
		}

		public void setPassword(String password) {
		this.password.sendKeys(password);
		}

		public void clearForm() {
		password.clear();
		email.clear();
		}

		public void submit() {
		submit.click();
		}

		public List<String> getErrors() {
		List<String> errorMessages = new ArrayList<String>();
		for(WebElement e:errors) {
		errorMessages.add(e.getText());
		}
		return errorMessages;
		}

		public WebElement getAllow() {
		return allow;
		}

		public WebElement getCaptcha() {
		return captcha;
		}
		
}
