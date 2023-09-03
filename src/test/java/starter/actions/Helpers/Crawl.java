package starter.actions.Helpers;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class Crawl  extends PageObject{

    WebElementFacade navbar;


    List<String> urls;
    public void get_links(){


        navbar = find(By.id("menu-top-menu"));

        urls = navbar.findElements(By.tagName("a"))
                                                    .stream()
                                                    .map(webElement -> webElement.getAttribute("href"))
                                                    .collect(Collectors.toList());
//        find(By.id())
    }

    public List<String> getUrls(){
        get_links();
        return urls;
    }


}
