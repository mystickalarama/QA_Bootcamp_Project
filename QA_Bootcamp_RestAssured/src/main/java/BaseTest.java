import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;

public class BaseTest extends BaseLibrary{

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }
}
