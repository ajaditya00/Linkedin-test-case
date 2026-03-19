package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.ExcelUtil;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData")
    public void loginTest(String email, String password) {

        LoginPage login = new LoginPage(driver);
        login.enterEmail(email);
        login.enterPassword(password);
        login.clickSignIn();

        HomePage home = new HomePage(driver);

        if (email.equals("valid@email.com")) {
            Assert.assertTrue(home.isProfileIconDisplayed());
        } else {
            Assert.assertTrue(login.getErrorMessage().contains("incorrect"));
        }
    }

    @DataProvider
    public Object[][] loginData() {
        return ExcelUtil.getLoginData(
                "testdata/LoginData.xlsx",
                "Sheet1"
        );
    }
}
