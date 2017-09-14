package steps;


import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps extends BaseSteps {

    @Step("выбран пункт меню {0}")
    public void registrate(){
        new MainPage(getDriver()).registrate();
    }
}
