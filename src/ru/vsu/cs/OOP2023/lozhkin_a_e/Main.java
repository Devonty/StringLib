package ru.vsu.cs.OOP2023.lozhkin_a_e;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String sample = "012345678#-#baobab#-#BAOBAB";
        System.out.println("-".repeat(20));

        System.out.println(StringUtils.indexOf(sample, "NONE"));
        System.out.println(StringUtils.indexOf(sample, "a", 10));
        System.out.println(StringUtils.indexOf(sample, "a", 100));

        System.out.println("-".repeat(20) + "split");

        System.out.println(StringUtils.split("--A--AA--AAA--AAAA--AAAAA", "--"));

        System.out.println("-".repeat(20) + "join");

        System.out.println(StringUtils.join("--", List.of("1", "2", "#")));

        System.out.println("-".repeat(20) + "replace");

        System.out.println(StringUtils.replace("TO_REPLACE 012TO_REPLACE6789 TO_REPLACETO_REPLACE#", "TO_REPLACE", "REPLACED"));

        System.out.println("-".repeat(20) + "equals");

        System.out.println(StringUtils.equals("123", "123"));
        System.out.println(StringUtils.equals("123", "124"));

        System.out.println("-".repeat(20) + "equalsIgnoreCase");

        System.out.println(StringUtils.equalsIgnoreCase("HAHA", "haha"));
        System.out.println(StringUtils.equalsIgnoreCase("HAHA#", "haHA#"));
        System.out.println(StringUtils.equalsIgnoreCase("HAHA", "NanA"));

        System.out.println("-".repeat(20) + "to upper/lower");

        System.out.println(sample);
        System.out.println(StringUtils.toUpper(sample));
        System.out.println(StringUtils.toLower(sample));

        System.out.println("-".repeat(20) + "is upper");

        System.out.println(StringUtils.isUpper(sample));
        System.out.println(StringUtils.isUpper(StringUtils.toUpper(sample)));

        System.out.println("-".repeat(20) + "is lower");

        System.out.println(StringUtils.isLower(sample));
        System.out.println(StringUtils.isLower(StringUtils.toLower(sample)));

        System.out.println("-".repeat(20) + "trims");

        String toTrim = "    4spaces    ";
        System.out.println("|"+ toTrim + "|");
        System.out.println("|"  + StringUtils.leftTrim(toTrim) + "|");
        System.out.println("|"  + StringUtils.rightTrim(toTrim) + "|");
        System.out.println("|"  + StringUtils.trim(toTrim) + "|");

        System.out.println("|"  + StringUtils.trim("        ") + "|");

    }

}
