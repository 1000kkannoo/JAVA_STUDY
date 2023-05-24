package ch10.service;

import ch10.model.Price;

public class BasicPriceProcessor implements PriceProcessor{
    @Override
    public Price process(Price price) {
        return price;
    }
}
