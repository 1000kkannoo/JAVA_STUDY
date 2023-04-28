package ch10.service;

import ch10.model.User;

public class VerifyYourEmailAddressEmailProvider implements EmailProvider{
    @Override
    public String getEmail(User user) {
        return "'Verify Your Email Address' email for " + user.getName();
    }
}
