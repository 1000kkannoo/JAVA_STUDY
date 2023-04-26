package ch7;

import ch6.filter.User;

public class NullPointTest {
    public static void main(String[] args) {
        User user1 = new User()
                .setId(1001)
                .setName("kevin")
                .setVerified(false);
        User user2 = new User()
                .setId(1001)
                .setName("kevin")
                .setEmailAddress("kevin@gmail.com")
                .setVerified(false);

        System.out.println("Same? : " + userEquals(user1,user2));
    }

    public static boolean userEquals(User u1, User u2) {
        return u1.getId() == u2.getId()
                && u1.getName().equals(u2.getName())
                && u1.getEmailAddress().equals(u2.getEmailAddress())
                && u1.isVerified() == u2.isVerified();
    }
}
