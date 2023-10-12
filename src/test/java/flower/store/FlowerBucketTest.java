package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {

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
        FlowerBucket flowerBucket = new FlowerBucket();
        Assertions.assertEquals(0.0, flowerBucket.getPrice());
    }


    @Test
    public void testAddFlowerPackAndGetPrice() {
        FlowerPack flowerPack = new FlowerPack(flower, 5.0);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);
        Assertions.assertEquals(10.0, flowerBucket.getPrice());
    }
}

