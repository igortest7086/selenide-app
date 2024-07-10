package ui_suite.tests;

import org.junit.Test;
import ui_suite.models.User;
import ui_suite.pages.LoginPage;
import ui_suite.pages.MainPage;
import ui_suite.services.UserCreator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserAccessTests extends CommonConditions{

    @Test
    public void oneCanLoginGithub()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        mainPage.openPage()
                .clickLogInButton();
        loginPage.openPage()
                .login(testUser);
        assertEquals(mainPage.getLoggedInUserName(), testUser.getUsername());

    }
}
