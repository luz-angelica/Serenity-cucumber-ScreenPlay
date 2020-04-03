package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import user_interfaces.MyElement;

public class ShowTheResultsSearchQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy ( Actor actor ) {
        String text = MyElement.TEXT_RESULT_SEARCH.resolveFor(actor).getText();
        System.out.print(text+"hellooo    ");
        if(text.contains("result")) {
        System.out.print("si retorna true");
            return true;
        }
        else {

            return false;
        }
    }

    public static ShowTheResultsSearchQuestion text() {
        return new ShowTheResultsSearchQuestion();
    }
}
