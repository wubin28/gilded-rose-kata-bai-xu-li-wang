
public class Item {
    private String itemType;
    private int sellIn;
    private int quality;
    
    public Item(String itemType, int sellIn, int quality){
        this.itemType = itemType;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality(){
        this.sellIn = 7;
        this.quality = 9; 
    }

    
}
