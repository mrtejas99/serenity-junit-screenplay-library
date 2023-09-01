package starter.lifechangers;

import net.serenitybdd.core.pages.PageObject;

public class LoginRegisterPage extends PageObject{

    public void fillLoginForm(){
        $("#username").sendKeys("tejas.lotlikar@xyzabc.com");
        $("#password").sendKeys("1234578");
        $("p:nth-child(3) > input.btn.btn-primary").click();
    }
    
    public String accountPageIsVisible(){
        return $("body > div > section.section.section-home-latest.woocommerce > div > div > h5").getText();
    }
}
