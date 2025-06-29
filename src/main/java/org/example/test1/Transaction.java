package org.example.test1;

import java.time.LocalDate;

public record Transaction(LocalDate date, int amount, int balance) {}
