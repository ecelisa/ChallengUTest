package co.com.automatization.challengeUTest.tasks;

import co.com.automatization.challengeUTest.userinterface.UTestForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterForm implements Task {
    private String txtName;
    private String txtLastName;
    private String txtEmail;
    private String txtMonth;
    private String txtDay;
    private String txtYear;
    private String txtLanguage;
    private String txtPassword;
    private String txtConfirm;

    public RegisterForm(String txtName, String txtLastName, String txtEmail, String txtMonth, String txtDay, String txtYear, String txtLanguage, String txtPassword, String txtConfirm) {
        this.txtName = txtName;
        this.txtLastName = txtLastName;
        this.txtEmail = txtEmail;
        this.txtMonth = txtMonth;
        this.txtDay = txtDay;
        this.txtYear = txtYear;
        this.txtLanguage = txtLanguage;
        this.txtPassword = txtPassword;
        this.txtConfirm = txtConfirm;
    }

    public static RegisterForm fillForm(String txtName, String txtLastName, String txtEmail, String txtMonth, String txtDay, String txtYear, String txtLanguage, String txtPassword, String txtConfirm) {
        return Tasks.instrumented(RegisterForm.class, txtName, txtLastName, txtEmail, txtMonth, txtDay, txtYear, txtLanguage, txtPassword, txtConfirm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(txtName).into(UTestForm.INPUT_NAME),
                Enter.theValue(txtLastName).into(UTestForm.INPUT_LASTNAME),
                Enter.theValue(txtEmail).into(UTestForm.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(txtMonth).from(UTestForm.SELECT_MONTH),
                SelectFromOptions.byVisibleText(txtDay).from(UTestForm.SELECT_DAY),
                SelectFromOptions.byVisibleText(txtYear).from(UTestForm.SELECT_YEAR),
                Enter.theValue(txtLanguage).into(UTestForm.INPUT_LANGUAGE),
                Click.on(UTestForm.BUTTON_NEXT_1),
                Click.on(UTestForm.BUTTON_NEXT_2),
                Click.on(UTestForm.BUTTON_NEXT_2),
                Enter.theValue(txtPassword).into(UTestForm.INPUT_PASSWORD),
                Enter.theValue(txtConfirm).into(UTestForm.INPUT_CONFIRM),
                Click.on(UTestForm.CHECKBOX_INFORMED),
                Click.on(UTestForm.CHECKBOX_TERMS),
                Click.on(UTestForm.CHECKBOX_PRIVACY),
                Click.on(UTestForm.BUTTON_NEXT_1)
        );
    }
}
