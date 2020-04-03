package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import user_interfaces.MyElement;

import java.util.List;
import java.util.stream.Collectors;

public class ShowTheResultsWordQuestion  implements Question<Boolean> {

    @Override
    public Boolean answeredBy ( Actor actor ) {
        List<WebElementFacade> list = MyElement.RESULTS_SHOW.resolveAllFor(actor);
        List<String> getText = list.stream().map(element -> element.getText()).collect(Collectors.toList());

        if (getText.get(3).contains("The Name of the Wind by Patrick Rothfuss")){
            System.out.print("entro a true");
                return true;
            }
        else{
            System.out.print("entro a false");
                return false;

            }
    }

    public static ShowTheResultsWordQuestion ReturnWord() {
        return new ShowTheResultsWordQuestion();
    }

}
