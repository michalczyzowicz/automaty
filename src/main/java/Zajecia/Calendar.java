package Zajecia;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calendar {
	@FindBy(className = "c2-month-header-monthname")
	private List<WebElement> month;

	private HashMap<String, List<WebElement>> daysWithMonth = new HashMap();

	public List<WebElement> getMonth() {
		return month;
	}

	public HashMap<String, List<WebElement>> getDaysWithMonth() {
		for (WebElement m : month) {
			if (StringUtils.isNotEmpty(m.getText())) {
				WebElement days = m.findElement(By.xpath("../../.."));
				daysWithMonth.put(m.getText(), days.findElements(By.className("c2-day")));
			}
		}
		return daysWithMonth;
	}
}
