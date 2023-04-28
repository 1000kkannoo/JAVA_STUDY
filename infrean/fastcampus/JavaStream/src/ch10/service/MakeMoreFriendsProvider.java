package ch10.service;

import ch10.model.User;

public class MakeMoreFriendsProvider implements EmailProvider{
    @Override
    public String getEmail(User user) {
        return "'Make More Friends' email for " + user.getName() ;
    }
}
