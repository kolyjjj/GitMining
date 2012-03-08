import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class JavaMethodLengthTest {
    @Test
    public void should_return_1_for_get_method_length() {
        String methodCode = "public int add(int x, int y) { \n" +
                            "return x + y;\n" +
                            "}";

        assertEquals(1, new JavaAnalyst().getMethodLength(methodCode));
    }
}
