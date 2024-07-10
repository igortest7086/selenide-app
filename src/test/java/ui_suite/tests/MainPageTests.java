package ui_suite.tests;

import org.junit.Test;
import ui_suite.enums.HeaderMenuType;
import ui_suite.pages.MainPage;

public class MainPageTests extends CommonConditions{

    MainPage mainPage = new MainPage();

    @Test
    public void optionsArePresentTest() {
        mainPage.openPage()
                .checkOptionInHeaderMenuIsPresent(HeaderMenuType.PRODUCT)
                .checkOptionInHeaderMenuIsPresent(HeaderMenuType.SOLUTIONS)
                .checkOptionInHeaderMenuIsPresent(HeaderMenuType.RESOURCES)
                .checkOptionInHeaderMenuIsPresent(HeaderMenuType.OPEN_SOURCE)
                .checkOptionInHeaderMenuIsPresent(HeaderMenuType.ENTERPRISE)
                .checkOptionInHeaderMenuIsPresent(HeaderMenuType.PRICING);
    }

}
