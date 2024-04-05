package ru.netology.java13;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        if (t1.getFlyTime() < t2.getFlyTime()) {
            return -1;
        } else if (t1.getFlyTime() > t2.getFlyTime()) {
            return 1;
        } else {
            return 0;
        }
    }
}