import org.testng.annotations.DataProvider;

public class DataProviderForEmailCheking {
    @DataProvider(name="Happy")
    public static Object[][] Happy() {
        return new Object[][]{
                {"1_!@ab.ab"},
                {"1_!@ab.abcde"},
                {"1_!@AB.ab"},
                {"1_!@AB.abcde"},
                {"1_!@12.ab"},
                {"1_!@12.abcde"},
                {"1_!@aB3C4.ab"},
                {"1_!@aB3C4.abcde"},
                {"a_!@ab.ab"},
                {"a_!@ab.abcde"},
                {"a_!@AB.ab"},
                {"a_!@AB.abcde"},
                {"a_!@12.ab"},
                {"a_!@12.abcde"},
                {"a_!@aB3C4.ab"},
                {"a_!@aB3C4.abcde"},
                {"A_!@ab.ab"},
                {"A_!@ab.abcde"},
                {"A_!@AB.ab"},
                {"A_!@AB.abcde"},
                {"A_!@12.ab"},
                {"A_!@12.abcde"},
                {"A_!@aB3C4.ab"},
                {"A_!@aB3C4.abcde"},
                {"abc123ABC456def789_!@ab.ab"},
                {"abc123ABC456def789_!@ab.abcde"},
                {"abc123ABC456def789_!@AB.ab"},
                {"abc123ABC456def789_!@AB.abcde"},
                {"abc123ABC456def789_!@12.ab"},
                {"abc123ABC456def789_!@12.abcde"},
                {"abc123ABC456def789_!@aB3C4.ab"},
                {"abc123ABC456def789_!@aB3C4.abcde"},
        };
    }
    @DataProvider(name="unhappy")
    public static Object[][] Unhappy(){
        return new Object[][]{
                {"ddddddddddddddddddddddddd_!@ab.ab"},
                {"dddddddddddddddddddddddddddddddd1!@ab.abcde"},
                {"1ddd_dddd@AB.abddddd"},
                {"11@AB.abcdedddddd"},
                {"1_!@123456.abddddddd"},
                {"1_!@1.abcdef"},
                {"1_!@aB3C4.Ab"},
                {"abc123ABC456def7890_!@aB3C4.abcde"},
        };
    }
}
