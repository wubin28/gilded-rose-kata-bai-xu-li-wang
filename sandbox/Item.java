
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
        if(this.itemType == "aged_brie"){
           this.sellIn = 13;
           this.quality = 11; 
        }else{
            if(this.sellIn < 0){
                this.quality -=2;
            }else{
                this.quality -= 1; 
            }
            this.sellIn -= 1;
        }
    }

    public int getSellIn(){
        return this.sellIn;
    }

    public int getQuality(){
        return this.quality;
    }
}