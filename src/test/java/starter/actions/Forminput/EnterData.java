package starter.actions.Forminput;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterData {

    public static Performable forminput(String searchTerm, By identifier) {
        return Task.where("Addes Data to input field",
                Enter.theValue(searchTerm)
                        .into(identifier)

        );
    }

    public static  Performable CLickELement(By identifier)
    {
        return  Task.where("Clicks ",
                Click.on(identifier)
                );
    }
}
