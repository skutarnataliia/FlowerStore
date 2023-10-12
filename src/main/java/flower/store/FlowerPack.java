package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private double quantity;

    public FlowerPack(Flower flower, double quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity > 0 ? quantity : 1;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
