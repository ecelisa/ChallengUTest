package co.com.automatization.challengeUTest.questions;

import co.com.automatization.challengeUTest.userinterface.UTestForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;

public class Question implements net.serenitybdd.screenplay.Question<Boolean> {
    private String txtQuestion;

    public Question(String txtQuestion) {
        this.txtQuestion = txtQuestion;
    }

    public static Question thePage(String txtQuestion) {
        return new Question(txtQuestion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String title = Text.of(UTestForm.LABEL_PAGE).viewedBy(actor).asString();
        if (txtQuestion.equals(title)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
