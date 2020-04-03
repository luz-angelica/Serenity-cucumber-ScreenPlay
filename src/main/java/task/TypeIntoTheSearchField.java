package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import user_interfaces.MyElement;

public class TypeIntoTheSearchField implements Task {

    private String wordType;

    public TypeIntoTheSearchField ( String word ) {

        this.wordType = word;
    }

    @Override
    public <T extends Actor> void performAs(T actor ) {
        actor.attemptsTo(
        Click.on(MyElement.LABEL_SEARCH_WORD),
        Enter.theValue(wordType).into(MyElement.LABEL_SEARCH_WORD)

        );
    }

    public static TypeIntoTheSearchField WithThisInformation(String word) {

        return new TypeIntoTheSearchField(word);
    }
}

