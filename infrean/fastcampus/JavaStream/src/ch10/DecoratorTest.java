package ch10;

import ch10.model.Price;
import ch10.service.BasicPriceProcessor;
import ch10.service.DiscountPriceProcessor;
import ch10.service.PriceProcessor;
import ch10.service.TaxPriceProcessor;

public class DecoratorTest {
    public static void main(String[] args) {
        Price unprocessedPrice = new Price("Original Price");

        PriceProcessor basicPriceProcessor = new BasicPriceProcessor();
        PriceProcessor discountPriceProcessor = new DiscountPriceProcessor();
        PriceProcessor taxPriceProcessor = new TaxPriceProcessor();

        PriceProcessor decoratedPriceProcessor = basicPriceProcessor
                .andThen(discountPriceProcessor)
                .andThen(taxPriceProcessor);

        Price processedPrice = decoratedPriceProcessor.process(unprocessedPrice);
        System.out.println(processedPrice.getPrice());

        // class를 추가하지않고 바로 정의하는 방식 -> 재활용이 불가능함
        // 상황에 따라 패턴을 클래스로 생성할지, 바로 정의 할지 구현해야함
        PriceProcessor decoratedPriceProcessor2 = basicPriceProcessor
                .andThen(taxPriceProcessor)
                .andThen(price -> new Price(price.getPrice() + ", then apply another procedure"));

        Price processedPrice2 = decoratedPriceProcessor2.process(unprocessedPrice);
        System.out.println(processedPrice2.getPrice());
    }
}
