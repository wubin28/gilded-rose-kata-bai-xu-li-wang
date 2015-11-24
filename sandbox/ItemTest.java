import org.junit.*;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void at_the_end_of_each_day_our_sytem_lowers_both_values_for_each_normal_item(){
        //Given
        Item item = new Item("normal", 14, 10);

        //When
        item.updateQuality();

        //Then
        assertEquals(13,item.getSellIn());
        assertEquals(9,item.getQuality());
    }
    
    @Test
    public void once_the_sell_by_date_has_passed_quality_degrades_twice_as_fast(){
        //Given
        Item item = new Item("normal", -5, 10);

        //When
        item.updateQuality();

        //Then
        assertEquals(-6, item.getSellIn());
        assertEquals(8, item.getQuality());
    }

    @Test
    public void aged_brie_actually_increases_in_quality_when_geting_older(){
        //Given
        Item item = new Item("aged_brie", 14, 10);

        //When
        item.updateQuality();

        //Then
        assertEquals(13,item.getSellIn());
        assertEquals(11,item.getQuality());    
    }

    @Test
    public void once_sellIn_is_negative_aged_brie_increases_in_quality_by_2_when_geting_older(){
        //Given
        Item item = new Item("aged_brie", -49, 48);

        //When
        item.updateQuality();

        //Then
        assertEquals(-50,item.getSellIn());
        assertEquals(50,item.getQuality());    
    }
    
    @Test
    public void backstage_passes_increases_in_quality_by_1_when_sellIn_greater_than_10(){
        //Given
        Item item = new Item("backstage_passes", 14, 10);

        //When
        item.updateQuality();

        //Then
        assertEquals(13,item.getSellIn());
        assertEquals(11,item.getQuality());    
    }

    @Test
    public void backstage_passes_increases_in_quality_by_2_when_sellIn_between_5_and_10(){
        //Given
        Item item = new Item("backstage_passes", 7, 10);

        //When
        item.updateQuality();

        //Then
        assertEquals(6,item.getSellIn());
        assertEquals(12,item.getQuality());    
    }
    
}