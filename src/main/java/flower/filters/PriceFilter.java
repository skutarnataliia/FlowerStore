package flower.filters;

import flower.store.Item;

public class PriceFilter implements SearchFilter {
    private double minPrice;
    private double maxPrice;

    public PriceFilter(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean match(Item item) {
        double itemPrice = item.getPrice();
        return itemPrice >= minPrice && itemPrice <= maxPrice;
    }
}
