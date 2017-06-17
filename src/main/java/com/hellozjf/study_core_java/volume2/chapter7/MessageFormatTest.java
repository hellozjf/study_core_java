package com.hellozjf.study_core_java.volume2.chapter7;

import java.text.MessageFormat;
import java.util.GregorianCalendar;

public class MessageFormatTest {
    public static void main(String[] args) {
        String msg = MessageFormat.format(
                "On {2, date, long}, a {0} destroyed {1,choice,0#no houses|1#one house|2#{1} houses} and caused {3, number, currency} of damage.",
                "hurricane", 99, new GregorianCalendar(1999, 0, 1).getTime(),
                10.0E8);
        System.out.println(msg);
    }
}
