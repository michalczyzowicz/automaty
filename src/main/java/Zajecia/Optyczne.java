package Zajecia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Optyczne {

    @FindBy(className = "article-header")
    private WebElement article;

    public WebElement getArticle() {
        return article;
    }

    public void setArticle(WebElement article) {
        this.article = article;
    }

}
