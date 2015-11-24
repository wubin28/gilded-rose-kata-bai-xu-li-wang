import org.junit.*;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void after_update_lower_both_values_at_each_day(){
        Item item = new Item("normal",8,10);
        item.updateQuality();
        
       // assertEquals(new Item("noraml",7,9),item);
        assertEquals(9,item.getSellIn());
        
    }
}
