package com.futurecollars.lesson14;

import java.util.Optional;

public class EmailUser {
    private String firstName;
    private String lastName;
    private String signaturePrefix;

    public EmailUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Optional<String> getSignaturePrefix() {
        return Optional.ofNullable(signaturePrefix);
    }

    public void setSignaturePrefix(String signaturePrefix) {
        this.signaturePrefix = signaturePrefix;
    }

    public String getSignature() {
        return getSignaturePrefix().orElse("z poważaniem, ") + "\n" + firstName + " " + lastName;
    }



}
