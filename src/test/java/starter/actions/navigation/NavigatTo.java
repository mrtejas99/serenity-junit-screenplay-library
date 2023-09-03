package starter.actions.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigatTo {
    public static Performable theSearchHomePage() {
        return Task.where("{0} opens the lifechangers home page",
                Open.browserOn().the(DemoBlaze.class));
    }
}
