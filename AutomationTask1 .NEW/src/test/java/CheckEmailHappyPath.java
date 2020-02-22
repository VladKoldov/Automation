import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {

    @Test(dataProvider = "DataForHappyPathEmails",dataProviderClass = DataProviderForEmailCheking.class)

    public void CheckEmailHappyPathVerification(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult,"Input parameters do not meet the requirements");

    }

}
