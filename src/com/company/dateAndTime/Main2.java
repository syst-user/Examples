package com.company.dateAndTime;

import java.time.Instant;
import java.time.ZoneId;

public class Main2 {

    public static void main(String[] args) {

//        Названия таймзон для ZoneId
//        +2 -> "Europe/Kaliningrad";
//        +3 -> "Europe/Moscow";
//        +4 -> "Europe/Samara";
//        +5 -> "Asia/Yekaterinburg";
//        +6 -> "Asia/Omsk";
//        +7 -> "Asia/Novosibirsk";
//        +8 -> "Asia/Irkutsk";
//        +9 -> "Asia/Yakutsk";
//        +10 -> "Asia/Vladivostok";
//        +11 -> "Asia/Srednekolymsk";
//        +12 -> "Asia/Kamchatka";

        final int targetOffset = getOffsetByTimeZoneAbbrev("Asia/Irkutsk");
        final int moscowOffset = getOffsetByTimeZoneAbbrev("Europe/Moscow");

        System.out.println("Смещение относительно МСК: " + (targetOffset - moscowOffset));
    }

    private static int getOffsetByTimeZoneAbbrev(final String timeZoneAbbrev) {
        return ZoneId.of(timeZoneAbbrev)
                .getRules()
                .getOffset(Instant.now())
                .getTotalSeconds() / 3600;
    }

}
