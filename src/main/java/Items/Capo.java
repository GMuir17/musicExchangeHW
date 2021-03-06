package Items;

import Behaviours.ISell;

public class Capo implements ISell {

    private String description;
    private int buyingPrice;
    private int sellingPrice;

    public Capo(String description, int buyingPrice, int sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public int getBuyingPrice() {
        return this.buyingPrice;
    }

    public int getSellingPrice() {
        return this.sellingPrice;
    }

    public int calculateMarkup() {
        int markup = this.sellingPrice - this.buyingPrice;
        return markup;
    }

}
