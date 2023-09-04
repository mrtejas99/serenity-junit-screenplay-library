package starter.actions.Verifiers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.By;


public class Verifier extends PageObject {

    public void verifyIfExists(By identifier, Actor actor){
         assert find(identifier).isPresent() : true;
    }
}
