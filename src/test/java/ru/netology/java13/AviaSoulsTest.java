package ru.netology.java13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AviaSoulsTest {

    AviaSouls aviaSouls =new AviaSouls();

    Ticket ticket1 = new Ticket("Москва", "Питер",1000, 12, 24);
    Ticket ticket2 = new Ticket("Москва", "Питер",500, 11, 16);
    Ticket ticket3 = new Ticket("Москва", "Питер",1000, 12, 24);
    Ticket ticket4 = new Ticket("Москва", "Питер",700, 23, 1);
    Ticket ticket5 = new Ticket("Москва", "Питер",400, 11, 12);
    Ticket ticket6 = new Ticket("Москва", "Воронеж",400, 11, 12);
    Ticket ticket7 = new Ticket("Москва", "Питер",800, 12, 12);

    @BeforeEach
    public void setup() {
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
    }

    @Test
    public void testComparePrice() {

        Ticket[] expected = {ticket5, ticket2, ticket4, ticket7, ticket3, ticket1};
        Ticket[] actual = aviaSouls.search("Москва", "Питер");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testComparatorToTime() {

        Ticket[] expected = {ticket5, ticket4, ticket2, ticket3, ticket1, ticket7};
        TicketTimeComparator comparator = new TicketTimeComparator();
        Ticket[] actual = aviaSouls.searchAndSortBy("Москва", "Питер", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

}