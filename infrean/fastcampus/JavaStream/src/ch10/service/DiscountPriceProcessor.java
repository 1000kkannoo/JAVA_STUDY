package ch10.service;

import ch10.model.Price;

public class DiscountPriceProcessor implements PriceProcessor{
    @Override
    public Price process(Price price) {
        return new Price(price.getPrice() + " , then applied discount");
    }
}
