package Zajecia;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Reporter;
//import pgc.qa.web.element.CheckBoxElement;

public class WebUtils {

	public WebUtils() {
}

public static void selectListOption(Select element, String value) {
element.selectByValue(value);
}

public static void selectListOptionByText(Select element, String text) {
element.selectByVisibleText(text);
}

public static void waitSomeTime(int miliseconds) {
try {
Thread.sleep((long)miliseconds);
} catch (Exception var2) {
;
}

}

public static String getSelectedListValue(Select element) {
return element.getFirstSelectedOption().getAttribute("value");
}

public static boolean isItemOnSelectList(Select element, String text) {
boolean present = false;
Iterator var3 = element.getOptions().iterator();

while(var3.hasNext()) {
WebElement el = (WebElement)var3.next();
if(el.getText().equals(text)) {
present = true;
break;
}
}

return present;
}

public static String getSelectedListText(Select element) {
return element.getFirstSelectedOption().getText();
}

public static int getWindowSize(WebDriver driver) {
return driver.getWindowHandles().size();
}

public static void oneClick(WebDriver driver, WebElement element) {
Actions builder = new Actions(driver);
Action oneClick = builder.click(element).build();
oneClick.perform();
}

public static void oneClick(WebDriver driver) {
Actions builder = new Actions(driver);
Action oneClick = builder.click().build();
oneClick.perform();
}

public static void doubleClick(WebDriver driver, WebElement element) {
Actions builder = new Actions(driver);
Action oneClick = builder.doubleClick(element).build();
oneClick.perform();
}

public static void contextClick(WebDriver driver, WebElement element) {
Actions builder = new Actions(driver);
Action oneClick = builder.contextClick(element).build();
oneClick.perform();
}

public static void dragDrobBy(WebDriver driver, WebElement element, int x, int y) {
Actions builder = new Actions(driver);
Action move = builder.dragAndDropBy(element, x, y).build();
move.perform();
}

public static void moveToElement(WebDriver driver, WebElement element) {
Actions builder = new Actions(driver);
       Action move = builder.moveToElement(element).build();
move.perform();
}

public static void moveToElement(WebDriver driver, WebElement element, int xOffset, int yOffset) {
Actions builder = new Actions(driver);
Action move = builder.moveToElement(element, xOffset, yOffset).build();
move.perform();
}

public static void moveItemAndRelease(WebDriver driver, WebElement element, int x, int y) {
Actions builder = new Actions(driver);
builder.clickAndHold(element);
Action action = builder.build();
action.perform();
builder = new Actions(driver);
builder.moveByOffset(x, y).perform();
builder.build();
builder.release(element);
builder.release(element).perform();
}

public static void executeMove(WebDriver driver, WebElement element) {
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute(\"bottom\", \"33%\");", new Object[]{element});
}

public static void executeJavaScript(WebDriver driver, String script, WebElement element) {
JavascriptExecutor js = (JavascriptExecutor)driver;
if(element != null) {
js.executeScript(script, new Object[]{element});
} else {
js.executeScript(script, new Object[0]);
}

}

public static boolean isCookieLoaded(WebDriver driver, String cookieName) {
boolean cookieLoaded = false;
Set allCookies = driver.manage().getCookies();
Iterator var4 = allCookies.iterator();

while(var4.hasNext()) {
Cookie loadedCookie = (Cookie)var4.next();
if(loadedCookie.getName().equals(cookieName)) {
cookieLoaded = true;
break;
}
}

return cookieLoaded;
}

public static boolean isCookieLoaded(WebDriver driver, String cookieName, String cookieValue) {
boolean cookieLoaded = false;
Set allCookies = driver.manage().getCookies();
Iterator var5 = allCookies.iterator();

while(var5.hasNext()) {
Cookie loadedCookie = (Cookie)var5.next();
if(loadedCookie.getName().equals(cookieName) && loadedCookie.getValue().equals(cookieValue)) {
cookieLoaded = true;
break;
}
}

return cookieLoaded;
}

public static String getCookieValue(WebDriver driver, String cookieName) {
String value = "";
Set allCookies = driver.manage().getCookies();
Iterator var4 = allCookies.iterator();

Cookie loadedCookie;
do {
if(!var4.hasNext()) {
return value;
}

loadedCookie = (Cookie)var4.next();
} while(!loadedCookie.getName().equals(cookieName));

return loadedCookie.getValue();
}

public static boolean isBrowserErrorPresent(WebDriver driver) {
boolean err = false;
LogEntries logEntries = driver.manage().logs().get("browser");
Iterator var3 = logEntries.iterator();

while(var3.hasNext()) {
LogEntry entry = (LogEntry)var3.next();
if(entry.getLevel().getName().contains("ERROR")) {
err = true;
//Reporter.log(entry.getLevel() + ", message " + entry.getMessage());
}
}

return err;
}

public static void switchToWindow(WebDriver driver, String parent, int win, boolean removeParent) {
Set windowHandles = driver.getWindowHandles();
if(removeParent) {
windowHandles.remove(parent);
}

String[] windowNames = (String[])windowHandles.toArray(new String[windowHandles.size()]);
driver.switchTo().window(windowNames[win - 1]);
}

public static void sendKey(WebDriver driver, WebElement element, Keys key) {
Actions builder = new Actions(driver);
Action keybordSend = builder.sendKeys(element, new CharSequence[]{key}).build();
keybordSend.perform();
}

public static void focusElement(WebDriver driver, WebElement element) {
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
}

public static boolean isTextInSourceCode(WebDriver driver, String searchText) {
return driver.getPageSource().contains(searchText);
}

public static File shootWebElement(WebDriver driver, WebElement element) throws IOException {
File screenshot = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
Point p = element.getLocation();
int width = element.getSize().getWidth();
int height = element.getSize().getHeight();
BufferedImage img = ImageIO.read(screenshot);
img = img.getSubimage(p.getX(), p.getY(), width, height);
ImageIO.write(img, "png", screenshot);
return screenshot;
}

public static Select getSelectFromElement(WebElement element) {
Select select = new Select(element);
return select;
}

//public static CheckBoxElement getCheckboxFromElement(WebElement element) {
//CheckBoxElement check = new CheckBoxElement(element);
//return check;
//}

public static WebElement getParentElement(WebElement element) {
return element.findElement(By.xpath(".."));
}

public static List<WebElement> getElementTree(WebElement element, String tagName) {
ArrayList tree = new ArrayList();

try {
tree.add(element);

while(!getParentElement(element).getTagName().equals(tagName)) {
element = getParentElement(element);
tree.add(element);
}
} catch (NoSuchElementException var4) {
//Reporter.log("Cannot get all html tree of parent elements");
//Reporter.log(var4.getMessage());
}

return tree;
}

public static String getComputedStyles(WebDriver driver, WebElement element) {
JavascriptExecutor executor = (JavascriptExecutor)driver;
String script = "var s = \'\';var o = getComputedStyle(arguments[0]);for(var i = 0; i < o.length; i++){s+=o[i] + \':\' + o.getPropertyValue(o[i])+\';\';}return s;";
return (String)executor.executeScript(script, new Object[]{element});
}
}