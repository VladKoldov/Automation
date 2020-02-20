import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {

    @Test(dataProvider = "Unhappy",dataProviderClass = DataProviderForEmailCheking.class)

    public void test(String email) {
        boolean ActualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(ActualResult,"happy test passed");

    }

}
