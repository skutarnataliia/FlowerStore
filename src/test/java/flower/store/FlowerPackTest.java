package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class FlowerPackTest {

    private Flower flower;

    @BeforeEach
    public void setUp() {
        flower = new Flower();
        flower.setFlowerType(FlowerType.ROSE);
        flower.setColor(FlowerColor.RED);
        flower.setPrice(2.0);
    }

    @Test
    public void testGetPrice() {
        FlowerPack flowerPack = new FlowerPack(flower, 5.0);
        Assertions.assertEquals(10.0, flowerPack.getPrice());
    }

    @Test
    public void testSetQuantity() {
        FlowerPack flowerPack = new FlowerPack(flower, 3.0);
        flowerPack.setQuantity(-2);
        Assertions.assertEquals(1.0, flowerPack.getQuantity());
    }
}
