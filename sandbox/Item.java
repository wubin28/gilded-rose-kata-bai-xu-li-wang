
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
        this.sellIn -= 1;
        this.quality -= 1; 
    }

    public int getSellIn(){
        return this.sellIn;
    }

    public int getQuality(){
        return this.quality;
    }
}