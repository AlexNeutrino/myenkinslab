import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(app.add(1, 2), 3);
        //assertEquals(app.add(2, 2), 5);
    }

    @Test
    public void testSub() {
        App app = new App();
        assertEquals(app.sub(2, 1), 1);
    }

}
