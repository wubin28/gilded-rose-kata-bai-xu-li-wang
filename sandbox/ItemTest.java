import org.junit.*;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void after_update_lower_both_values_at_each_day(){
        //Given
        Item item = new Item("normal",14,10);

        //When
        item.updateQuality();

        //Then
        assertEquals(13,item.getSellIn());
        assertEquals(9,item.getQuality());
    }
    
    @Test
    public void after_update_quality_degrades_twice_when_sell_by_date_passed(){
        //Given
        Item item = new Item("normal",-5,10);

        //When
        item.updateQuality();

        //Then
        assertEquals(-6,item.getSellIn());
        assertEquals(8,item.getQuality());
    }

    //TODO
}