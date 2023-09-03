package starter.actions.Verifiers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.By;


public class Verifier_Object extends PageObject {

    public void verifyIfExists(By identifier, Actor actor){
//        actor.attemptsTo(Task.where("asdfgh",find(identifier)));
         assert find(identifier).isPresent() : true;
    }
}
