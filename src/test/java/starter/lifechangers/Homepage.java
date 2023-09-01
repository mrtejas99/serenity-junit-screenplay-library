package starter.lifechangers;

import org.openqa.selenium.By;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://lifechangers.org/")
@NamedUrls({
	@NamedUrl(name = "Home", url = "/"),
	@NamedUrl(name = "About Us", url = "/about-us"),
	@NamedUrl(name = "Resources", url = "/resources"),
	@NamedUrl(name = "Father's House", url = "?page_id=154"),
	@NamedUrl(name = "Events", url = "/events"),
	@NamedUrl(name = "News", url = "category/news"),
	@NamedUrl(name = "Contact", url = "/contact"),
	@NamedUrl(name = "Login/ Register", url = "/my-account")
})
public class Homepage extends PageObject {
    public String getHomepageTitle() {
    	return getTitle();
    }
    
    public void isLogoExist(){
        shouldBeVisible(By.cssSelector("a.navbar-brand"));
    }
}