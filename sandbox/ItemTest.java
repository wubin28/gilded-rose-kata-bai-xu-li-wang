import org.junit.*;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void after_update_lower_both_values_at_each_day(){
        Item item = new Item("normal",14,10);
        item.updateQuality();
        
        assertEquals(13,item.getSellIn());
        assertEquals(9,item.getQuality());
        
    }

 
}