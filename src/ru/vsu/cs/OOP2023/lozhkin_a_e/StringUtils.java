package ru.vsu.cs.OOP2023.lozhkin_a_e;

import java.util.*;

public class StringUtils {

    public static int indexOf(String string, String toFind, int indexStart) {
        if (toFind.length() > string.length()) return -1;

        for (int i = indexStart; i < string.length(); i++) {
            if (equalsStartsIndex(string, i, toFind)) return i;
        }
        return -1;
    }

    public static int indexOf(String string, String toFind) {
        return indexOf(string, toFind, 0);
    }

    public static boolean equals(String st1, String st2) {
        return equals(st1, st2, Alphabets.TO_SAME);
    }

    private static boolean equals(String st1, String st2, Map<Character, Character> alphabet) {
        if (st1.length() != st2.length()) return false;
        return equalsStartsIndex(st1, 0, st2, alphabet);
    }

    public static boolean equalsStartsIndex(String string, int indexStart, String equalsTo) {
        return equalsStartsIndex(string, indexStart, equalsTo, Alphabets.TO_SAME);
    }

    private static boolean equalsStartsIndex(String string, int indexStart, String equalsTo, Map<Character, Character> alphabet) {
        if (equalsTo.length() > string.length()) return false;
        if (indexStart + equalsTo.length() > string.length()) return false;

        for (int i = 0; i < equalsTo.length(); i++) {
            Character c1 = string.charAt(indexStart + i);
            Character c2 = equalsTo.charAt(i);
            if (alphabet.getOrDefault(c1, c1) != alphabet.getOrDefault(c2, c2)) {
                return false;
            }
        }
        return true;
    }

    public static List<String> split(String string, String det) {
        List<String> lst = new ArrayList<>();
        int indexStart = 0;
        int indexEnd;
        while (indexStart < string.length()) {
            int tmpI = indexOf(string, det, indexStart);
            indexEnd = tmpI != -1 ? tmpI : string.length();
            lst.add(string.substring(indexStart, indexEnd));
            indexStart = indexEnd + det.length();
        }
        return lst;
    }

    public static String replace(String string, String from, String to) {
        return join(to, split(string, from));
    }

    public static <T> String join(String connect, Collection<T> col) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<T> iterator = col.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toString());
            if (iterator.hasNext()) stringBuilder.append(connect);
        }
        return stringBuilder.toString();
    }

    public static boolean equalsIgnoreCase(String st1, String st2) {
        if (st2 == null) return false;
        return equalsStartsIndex(st1, 0, st2, Alphabets.TO_LOWER);
    }

    public static String toUpper(String toUp) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < toUp.length(); i++) {
            Character c = toUp.charAt(i);
            stringBuilder.append(Alphabets.TO_UPPER.getOrDefault(c, c));
        }
        return stringBuilder.toString();
    }

    public static String toLower(String toUp) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < toUp.length(); i++) {
            Character c = toUp.charAt(i);
            stringBuilder.append(Alphabets.TO_LOWER.getOrDefault(c, c));
        }
        return stringBuilder.toString();
    }

    public static boolean isUpper(String string) {
        for (int i = 0; i < string.length(); i++) {
            Character c = string.charAt(i);
            if (Alphabets.TO_UPPER.getOrDefault(c, c) != c) return false;
        }
        return true;
    }

    public static boolean isLower(String string) {
        for (int i = 0; i < string.length(); i++) {
            Character c = string.charAt(i);
            if (Alphabets.TO_LOWER.getOrDefault(c, c) != c) return false;
        }
        return true;
    }

    public static String leftTrim(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isWhitespace(string.charAt(i))) return string.substring(i);
        }
        return "";
    }

    public static String rightTrim(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            if (!Character.isWhitespace(string.charAt(i))) return string.substring(0, i);
        }
        return "";
    }

    public static String trim(String string) {
        int i1 = -1, i2 = -1;
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isWhitespace(string.charAt(i))) {
                i1 = i;
                break;
            }
        }
        for (int i = string.length() - 1; i >= 0; i--) {
            if (!Character.isWhitespace(string.charAt(i))) {
                i2 = i;
                break;
            }
        }
        if(i1 == -1 || i2 == -1) return "";
        return string.substring(i1, i2);
    }

}
