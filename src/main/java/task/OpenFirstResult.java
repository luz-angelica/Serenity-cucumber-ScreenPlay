package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import user_interfaces.MyElement;

public class OpenFirstResult implements Task {

    @Override
    public <T extends Actor> void performAs ( T actor ) {
        actor.attemptsTo(
                Click.on(MyElement.FIRST_RESULT)
        );
    }
    public static OpenFirstResult GivingClickHere() {
        return Tasks.instrumented(OpenFirstResult.class);
    }
}
