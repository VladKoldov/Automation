import org.testng.annotations.DataProvider;

public class DataProviderForEmailCheking {
    @DataProvider(name="DataForHappyPathEmails")
    public static Object[][] happy() {
        return new Object[][]{
                {"1_!@ab.ab"},
                {"abc123ABC456def789_!@aB3C4.abcde"},
        };
    }
    @DataProvider(name="DataForUnhappyPathEmails")
    public static Object[][] unhappy(){
        return new Object[][]{
                {"_!@a.a"},
                {"1_!@aa.a"},
                {"1_!@aa.aV"},
                {"_1!@1a2B_.aB"},
                {"_!1@a.a2"},
                {"A1b2__!@a.a"},
                {"Qazwsxedcrfvtgbyh123_!@1a.aa"},
                {"1ddd_dddd@AB.abddddd"},
                {"11@AB.abcdedddddd"},
                {"1_!@123456.abddddddd"},
                {"1_!@1.abcdef"},
                {"1_!@aB3C4.Ab"},
                {"abc123ABC456def7890_!@aB3C4.abcde"},
        };
    }
}
