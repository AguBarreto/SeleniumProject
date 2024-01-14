package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class FreeRangeSteps {
    
    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navegate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }
}
