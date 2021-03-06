package com.demo.useraccountservice.useraccount;

import com.demo.useraccountservice.common.EntityAlreadyExists;

import javax.validation.ConstraintViolationException;

public interface UserAccountService {

    /**
     * @throws IllegalArgumentException     if the given UserAccount object is null or password is empty
     * @throws EntityAlreadyExists          if the given UserAccount object has an email that has already been registered
     * @throws ConstraintViolationException if the given UserAccount object has validation errors
     */
    void registerWithPassword(UserAccount userAccount, String password)
            throws IllegalArgumentException, EntityAlreadyExists, ConstraintViolationException;

    /**
     * @return null if there is no registered user account with the provided credentials
     */
    UserAccount authenticateWithPassword(String email, String password);
}
