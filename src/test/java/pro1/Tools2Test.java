package pro1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Tools2Test
{
    @Test
void test01()
{
    Assertions.assertEquals(
            "2018-11-30T18:35:24Z",
            Tools2.czechDateTimeStringToUTC("30. 11. 2018 19:35:24").toString()

    );
}
    @Test
    void test02()
    {
        Assertions.assertEquals(
                "2019-08-30T18:35:24Z",
                Tools2.czechDateTimeStringToUTC("30. 8. 2019 20:35:24").toString()

        );
    }

}
