package org.example.test1;

import java.time.LocalDate;

public interface Clock {

    LocalDate today();

    Clock SYSTEM = LocalDate::now;
}