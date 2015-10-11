import CommonApi.Base;

/**
 * Created by kashifa on 10/10/15.
 */
public class UberBase extends Base {

    public void signuptoDriveforUberBlack(){

        clickByCss(".btn.ga-click-track");
        clickByCss("#continue-to-city");
        typeByCss("#ac-city", "New York");
        clickByXpath(".//*[@id='ac-form']/div/span/span/div/span/div[1]/p");
        //clickByCss("#locate");
        clickByXpath("html/body/div[2]/div/div[1]/div[1]/div[2]/a");
        typeByCss("#first-name", "MD");
        typeByCss("#last-name", "Rahman");
        typeByCss("#email","mdrahmantest@gmail.com");
        typeByCss("#mobile","1234567890");
        typeByCss("#password","test123");
        typeByCss("#referral-code", "12345");
        clickByXpath("html/body/div[2]/div/form/button");

    }

    public void signuptoDriveforUberTaxi(){

        clickByCss(".btn.ga-click-track");
        clickByCss("#continue-to-city");
        typeByCss("#ac-city", "New York");
        clickByXpath(".//*[@id='ac-form']/div/span/span/div/span/div[1]/p");
        clickByXpath("html/body/div[2]/div/div[1]/div[2]/div[2]/a");
        typeByCss("#first-name", "MD");
        typeByCss("#last-name", "Rahman");
        typeByCss("#email","mdrahmantest@gmail.com");
        typeByCss("#mobile","1234567890");
        typeByCss("#chauffeur","TLC12345");
        typeByCss("#chauffeur-expiration-month","12");
        typeByCss("#chauffeur-expiration-year","2017");
        typeByCss("#password","test123");
        typeByCss("#taxi-company-name","YellowTaxi");
        typeByCss("#referral-code", "12345");
        clickByXpath("html/body/div[2]/div/form/button");
    }

    public void signuptoDriveforDelivery(){

        clickByCss(".btn.ga-click-track");
        clickByCss("#continue-to-city");
        typeByCss("#ac-city", "New York");
        clickByXpath(".//*[@id='ac-form']/div/span/span/div/span/div[1]/p");
        clickByXpath("html/body/div[2]/div/div[1]/div[3]/div[2]/a");
        typeByCss("#first-name", "MD");
        typeByCss("#last-name", "Rahman");
        typeByCss("#email", "mdrahmantest@gmail.com");
        typeByCss("#mobile", "1234567890");
        typeByCss("#password","test123");
        typeByCss("#referral-code", "12345");
        clickByXpath("html/body/div[2]/div/form/button");
    }

    public void signuptoRide(){

        clickByCss(".icon-menu");
        clickByXpath("html/body/div[2]/nav/div[1]/a[3]");
        typeByCss("#email", "mdrahmantest@gmail.com");
        typeByCss("#password", "test123");
        typeByCss("#first_name", "MD");
        typeByCss("#last_name", "Rahman");
        typeByCss("#mobile", "1234567890");
        clickByXpath(".//*[@id='language']/option[9]");
        typeByCss("#card_number", "1234567890123456");
        typeByCss("#card_code","123");
        clickByXpath(".//*[@id='card_expiration_month-month']/option[1]");
        clickByXpath(".//*[@id='card_expiration_year-year']/option[4]");
        typeByCss("#billing_zip", "11435");
        clickByXpath("html/body/section/section/div[1]/section[2]/article/form/div[12]/div[1]/div[1]");
    }
}
