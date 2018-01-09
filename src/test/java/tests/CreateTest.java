package tests;


import org.testng.annotations.Test;
import properties.BaseTest;
import static org.testng.Assert.assertTrue;


public class CreateTest extends BaseTest {

    @Test
    public void searchInto() throws Exception {
        actions.openningPage();
        assertTrue(actions.headerDisplay(), "page does not have a tag with text \"Мобильные телефоны\"");
    }
}
