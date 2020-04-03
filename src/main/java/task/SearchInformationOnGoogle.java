package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import user_interfaces.MyElement;

public class SearchInformationOnGoogle implements Task {

    @Override
    public <T extends Actor> void performAs ( T actor ) {
        actor.attemptsTo(
        Click.on(MyElement.GOOGLE_SEARCH_BUTTON)
        );
    }

    public static SearchInformationOnGoogle WhitThisButton() {
        return Tasks.instrumented(SearchInformationOnGoogle.class);
    }
}
