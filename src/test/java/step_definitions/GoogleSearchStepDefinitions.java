package step_definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exception.ShowTheResultsSearchException;
import exception.ShowTheResultsWordException;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ShowTheResultsSearchQuestion;
import questions.ShowTheResultsWordQuestion;
import task.OpenFirstResult;
import task.SearchInformationOnGoogle;
import task.TypeIntoTheSearchField;
import utils.driver.WebDriverUtils;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GoogleSearchStepDefinitions {

     @Before
    public void setup() {
        setTheStage(new OnlineCast());
        theActorCalled("Search User");
    }

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() {
        theActorInTheSpotlight()
        .can(BrowseTheWeb.with(WebDriverUtils.inThePage("https://www.google.com/")));
    }


   @When("^I type (.*) into the search field$")
    public void i_type_The_name_of_the_wind_into_the_search_field(String word) {
        theActorInTheSpotlight().attemptsTo(TypeIntoTheSearchField.WithThisInformation(word));

    }

    @When("^I click the Google Search button$")
    public void i_click_the_Google_Search_button() {
        theActorInTheSpotlight().attemptsTo(SearchInformationOnGoogle.WhitThisButton());
    }

   @Then("^I go to the search results page$")
    public void i_go_to_the_search_results_page() {
      theActorInTheSpotlight().should(GivenWhenThen.seeThat(
      ShowTheResultsSearchQuestion.text()
      ).orComplainWith(ShowTheResultsSearchException.class,ShowTheResultsSearchException.MESSAGE_RESULT_SEARCH));
    }

    @Then("^the first result is \"The Name of the Wind - Patrick Rothfuss\"$")
    public void the_first_result_is_The_Name_of_the_Wind_Patrick_Rothfuss() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
        ShowTheResultsWordQuestion.ReturnWord()).orComplainWith(
        ShowTheResultsWordException.class,ShowTheResultsWordException.MESSAGE_WORD_SEARCH));
    }

    @When("^I click on the first result link$")
    public void i_click_on_the_first_result_link() {
         theActorInTheSpotlight().attemptsTo(OpenFirstResult.GivingClickHere());
    }

    @Then("^I go to the “Patrick Rothfuss - The Books” page$")
    public void i_go_to_the_Patrick_Rothfuss_The_Books_page() {

    }

    @When("^I click on the first result link$")
    public void iClickOnTheFirstResultLink() {

    }
/*

    @Then("^I go to the “Patrick Rothfuss - The Books” page$")
    public void iGoToThePatrickRothfussTheBooksPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the suggestions list is displayed$")
    public void theSuggestionsListIsDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the first suggestion in the list$")
    public void iClickOnTheFirstSuggestionInTheList() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the first result is “The Name of the Wind - Patrick Rothfuss”$")
    public void theFirstResultIsTheNameOfTheWindPatrickRothfuss() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/

}
