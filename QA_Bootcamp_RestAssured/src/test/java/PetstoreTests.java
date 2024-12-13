import org.testng.annotations.Test;

public class PetstoreTests extends BaseTest{

    BaseLibrary testLibrary = new BaseLibrary();

    @Test
    public void StarTest() {
        PostPet();
        PutPet();
        GetPet();
        DeletePet();
    }

}
