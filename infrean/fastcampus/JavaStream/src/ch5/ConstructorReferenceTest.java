package ch5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class ConstructorReferenceTest {
    public static void main(String[] args) {
        Map<String, BiFunction<String,String,Car>> carTypeToConstructorMap =
                new HashMap<>();

        carTypeToConstructorMap.put("sedan",Sedan::new);
        carTypeToConstructorMap.put("suv",Suv::new);
        carTypeToConstructorMap.put("van",Van::new);

//        BiFunction<Integer,String,User> userCreator = User::new;
//        User kevinDB = userCreator.apply(3, "JackGR");
//        System.out.println(kevinDB);

        String[][] inputs = new String[][] {
                {"sedan", "Sonata", "Hyundai"},
                {"van", "Sienna", "Toyota"},
                {"sedan", "Model S", "Tesla"},
                {"suv", "Sorento", "KIA"}
        };

        List<Car> cars = new ArrayList<>();
        for (String[] input : inputs) {
            String carType = input[0];
            String name = input[1];
            String brand = input[2];

            cars.add(carTypeToConstructorMap.get(carType).apply(name, brand));
        }

        for (Car car : cars) {
            car.drive();
        }
    }
}
