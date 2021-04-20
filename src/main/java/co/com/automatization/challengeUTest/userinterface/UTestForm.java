package co.com.automatization.challengeUTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestForm {
    public static final Target BUTTON_REDIRECT = Target.the("button for redirect to form").located(By.xpath("//a[text()='Join Today']"));
    public static final Target INPUT_NAME  = Target.the("element where do write a name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME  = Target.the("element where do write a lastname").located(By.id("lastName"));
    public static final Target INPUT_EMAIL  = Target.the("element where do write a email").located(By.id("email"));
    public static final Target SELECT_MONTH  = Target.the("element where do select a month").located(By.id("birthMonth"));
    public static final Target SELECT_DAY  = Target.the("element where do select a day").located(By.id("birthDay"));
    public static final Target SELECT_YEAR  = Target.the("element where do select a year").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE  = Target.the("element where do write a language").located(By.xpath("//input[@class='ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty']"));
    public static final Target BUTTON_NEXT_1  = Target.the("button for redirect the next section").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target BUTTON_NEXT_2  = Target.the("button for redirect the next section").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD  = Target.the("element where do write a password").located(By.id("password"));
    public static final Target INPUT_CONFIRM  = Target.the("element where do write a confirm of the password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_INFORMED  = Target.the("element where do select 1").located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target CHECKBOX_TERMS  = Target.the("element where do select 2").located(By.id("termOfUse"));
    public static final Target CHECKBOX_PRIVACY  = Target.the("element where do select 3").located(By.id("privacySetting"));
    public static final Target LABEL_PAGE = Target.the("title of the page").locatedBy("//span[@class='sub-title']");
}
