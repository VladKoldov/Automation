import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckemailHappyPath {

    @Test(dataProvider = "Happy",dataProviderClass = DataProviderForEmailCheking.class)

    public void test(String email) {
        boolean ActualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(ActualResult,"Happy test failed");

    }

}
