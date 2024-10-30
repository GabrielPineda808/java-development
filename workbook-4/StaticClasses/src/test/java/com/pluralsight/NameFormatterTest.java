package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test
    void format_firstNameLastName() {
        String firstName = "Gabriel";
        String lastName = "Pineda";

        String fullName = NameFormatter.format(firstName,lastName);

        assertEquals("Pineda, Gabriel", fullName);
    }

    @Test
    void format_allNameFields() {
        String firstName = "Gabriel";
        String lastName = "Pineda";
        String middleName = "Omar";
        String prefix = "Dr.";
        String suffix = "Sr.";

        String fullName = NameFormatter.format(prefix,firstName,middleName,lastName,suffix);

        assertEquals("Dr. Gabriel Omar Pineda Sr.", fullName);
    }
}