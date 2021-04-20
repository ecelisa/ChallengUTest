package co.com.automatization.challengeUTest.tasks;

import co.com.automatization.challengeUTest.userinterface.UTestForm;
import co.com.automatization.challengeUTest.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UTestPage uTestPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(uTestPage),
                Click.on(UTestForm.BUTTON_REDIRECT)
        );
    }
}
