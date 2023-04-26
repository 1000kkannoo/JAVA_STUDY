package ch7;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        String someEmail = "some@gmail.com";
        String nullEmail = null;

        Optional<String> maybeEmail = Optional.of(someEmail);
        Optional<String> maybeEmail2 = Optional.empty();
        Optional<String> maybeEmail3 = Optional.ofNullable(someEmail);
        Optional<String> maybeEmail4 = Optional.ofNullable(nullEmail);

        String email = maybeEmail.get();
        System.out.println(email);

        if (maybeEmail2.isPresent()) {
            System.out.println(maybeEmail2.get());
        }

        String defaultEmail = "default@gmail.com";
        String email3 = maybeEmail2.orElse(defaultEmail);
        System.out.println(email3);
        String email4 = maybeEmail2.orElseGet(() -> defaultEmail);
        System.out.println(email4);
        String email5 = maybeEmail2.
                orElseThrow(() -> new RuntimeException("email not present"));
    }
}
