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

    public void setQuantity(double quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
        else {
            this.quantity = 1;
        }
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
