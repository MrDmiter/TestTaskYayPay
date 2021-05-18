import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void setup() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://www.demo.yaypay.com/login";
    }

    protected <T> T at(Class<T> pageClass) {
        return Selenide.page(pageClass);
    }
}
