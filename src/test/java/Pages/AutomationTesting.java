package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationTesting {

    public AutomationTesting(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#menu-item-40") public WebElement linkShop;
    @FindBy(linkText = "Home") public WebElement menuHome;
    @FindBy(xpath = "(//*[@class='n2-ow'])[1]") public WebElement iconSliderRight;
    @FindBy(xpath = "(//*[@class='n2-ow'])[2]") public WebElement iconSliderLeft;
    @FindBy(className = "pull-down") public WebElement iconPullDown;
    @FindBy(css = ".row_inner_wrapper") public List<WebElement> listArrivals;
    @FindBy(xpath = "//*[@title='Selenium Ruby']") public WebElement imageFirstArrival;
    @FindBy(css = ".single_add_to_cart_button.button.alt") public WebElement buttonAddToBasket;
    @FindBy(className = "woocommerce-LoopProduct-link") public List<WebElement> listProducts;
    @FindBy(css = ".product_title.entry-title") public WebElement textThinkinginHTML;
    @FindBy(xpath = "//*[@title='Thinking in HTML']") public WebElement imageThinkingProduct;
    @FindBy(css = ".button.wc-forward") public WebElement buttonViewBasket;
    @FindBy(css = ".description_tab.active") public WebElement buttonDescription;
    @FindBy(xpath = "(//*[@class='layoutArea'])[2]") public WebElement textProductDescription;
    @FindBy(className = "reviews_tab") public WebElement buttonReviews;
    @FindBy(css = "#comments") public WebElement textReviews;





}
