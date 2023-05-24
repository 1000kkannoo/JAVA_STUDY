package ch10.service;

import ch10.model.User;

public interface EmailProvider {
    String getEmail(User user);
}
