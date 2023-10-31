package ru.vsu.cs.OOP2023.lozhkin_a_e;

import java.util.HashMap;
import java.util.Map;

public class Alphabets {
    public static final Map<Character, Character> TO_LOWER = new HashMap<>(){{
        put('a', 'a'); put('A', 'a');
        put('b', 'b'); put('B', 'b');
        put('c', 'c'); put('C', 'c');
        put('d', 'd'); put('D', 'd');
        put('e', 'e'); put('E', 'e');
        put('f', 'f'); put('F', 'f');
        put('g', 'g'); put('G', 'g');
        put('h', 'h'); put('H', 'h');
        put('i', 'i'); put('I', 'i');
        put('j', 'j'); put('J', 'j');
        put('k', 'k'); put('K', 'k');
        put('l', 'l'); put('L', 'l');
        put('m', 'm'); put('M', 'm');
        put('n', 'n'); put('N', 'n');
        put('o', 'o'); put('O', 'o');
        put('p', 'p'); put('P', 'p');
        put('q', 'q'); put('Q', 'q');
        put('r', 'r'); put('R', 'r');
        put('s', 's'); put('S', 's');
        put('t', 't'); put('T', 't');
        put('u', 'u'); put('U', 'u');
        put('v', 'v'); put('V', 'v');
        put('w', 'w'); put('W', 'w');
        put('x', 'x'); put('X', 'x');
        put('y', 'y'); put('Y', 'y');
        put('z', 'z'); put('Z', 'z');

        put('а', 'а'); put('А', 'а');
        put('б', 'б'); put('Б', 'б');
        put('в', 'в'); put('В', 'в');
        put('г', 'г'); put('Г', 'г');
        put('д', 'д'); put('Д', 'д');
        put('е', 'е'); put('Е', 'е');
        put('ё', 'ё'); put('Ё', 'ё');
        put('ж', 'ж'); put('Ж', 'ж');
        put('з', 'з'); put('З', 'з');
        put('и', 'и'); put('И', 'и');
        put('й', 'й'); put('Й', 'й');
        put('к', 'к'); put('К', 'к');
        put('л', 'л'); put('Л', 'л');
        put('м', 'м'); put('М', 'м');
        put('н', 'н'); put('Н', 'н');
        put('о', 'о'); put('О', 'о');
        put('п', 'п'); put('П', 'п');
        put('р', 'р'); put('Р', 'р');
        put('с', 'с'); put('С', 'с');
        put('т', 'т'); put('Т', 'т');
        put('у', 'у'); put('У', 'у');
        put('ф', 'ф'); put('Ф', 'ф');
        put('х', 'х'); put('Х', 'х');
        put('ц', 'ц'); put('Ц', 'ц');
        put('ч', 'ч'); put('Ч', 'ч');
        put('ш', 'ш'); put('Ш', 'ш');
        put('щ', 'щ'); put('Щ', 'щ');
        put('ъ', 'ъ'); put('Ъ', 'ъ');
        put('ы', 'ы'); put('Ы', 'ы');
        put('ь', 'ь'); put('Ь', 'ь');
        put('э', 'э'); put('Э', 'э');
        put('ю', 'ю'); put('Ю', 'ю');
        put('я', 'я'); put('Я', 'я');
    }};

    public static final Map<Character, Character> TO_UPPER = new HashMap<>(){{
        put('a', 'A'); put('A', 'A');
        put('b', 'B'); put('B', 'B');
        put('c', 'C'); put('C', 'C');
        put('d', 'D'); put('D', 'D');
        put('e', 'E'); put('E', 'E');
        put('f', 'F'); put('F', 'F');
        put('g', 'G'); put('G', 'G');
        put('h', 'H'); put('H', 'H');
        put('i', 'I'); put('I', 'I');
        put('j', 'J'); put('J', 'J');
        put('k', 'K'); put('K', 'K');
        put('l', 'L'); put('L', 'L');
        put('m', 'M'); put('M', 'M');
        put('n', 'N'); put('N', 'N');
        put('o', 'O'); put('O', 'O');
        put('p', 'P'); put('P', 'P');
        put('q', 'Q'); put('Q', 'Q');
        put('r', 'R'); put('R', 'R');
        put('s', 'S'); put('S', 'S');
        put('t', 'T'); put('T', 'T');
        put('u', 'U'); put('U', 'U');
        put('v', 'V'); put('V', 'V');
        put('w', 'W'); put('W', 'W');
        put('x', 'X'); put('X', 'X');
        put('y', 'Y'); put('Y', 'Y');
        put('z', 'Z'); put('Z', 'Z');

        put('а', 'А'); put('А', 'А');
        put('б', 'Б'); put('Б', 'Б');
        put('в', 'В'); put('В', 'В');
        put('г', 'Г'); put('Г', 'Г');
        put('д', 'Д'); put('Д', 'Д');
        put('е', 'Е'); put('Е', 'Е');
        put('ё', 'Ё'); put('Ё', 'Ё');
        put('ж', 'Ж'); put('Ж', 'Ж');
        put('з', 'З'); put('З', 'З');
        put('и', 'И'); put('И', 'И');
        put('й', 'Й'); put('Й', 'Й');
        put('к', 'К'); put('К', 'К');
        put('л', 'Л'); put('Л', 'Л');
        put('м', 'М'); put('М', 'М');
        put('н', 'Н'); put('Н', 'Н');
        put('о', 'О'); put('О', 'О');
        put('п', 'П'); put('П', 'П');
        put('р', 'Р'); put('Р', 'Р');
        put('с', 'С'); put('С', 'С');
        put('т', 'Т'); put('Т', 'Т');
        put('у', 'У'); put('У', 'У');
        put('ф', 'Ф'); put('Ф', 'Ф');
        put('х', 'Х'); put('Х', 'Х');
        put('ц', 'Ц'); put('Ц', 'Ц');
        put('ч', 'Ч'); put('Ч', 'Ч');
        put('ш', 'Ш'); put('Ш', 'Ш');
        put('щ', 'Щ'); put('Щ', 'Щ');
        put('ъ', 'Ъ'); put('Ъ', 'Ъ');
        put('ы', 'Ы'); put('Ы', 'Ы');
        put('ь', 'Ь'); put('Ь', 'Ь');
        put('э', 'Э'); put('Э', 'Э');
        put('ю', 'Ю'); put('Ю', 'Ю');
        put('я', 'Я'); put('Я', 'Я');
    }};

    public static final Map<Character, Character> TO_SAME = new HashMap<>(){{
        put('a', 'a'); put('A', 'A');
        put('b', 'b'); put('B', 'B');
        put('c', 'c'); put('C', 'C');
        put('d', 'd'); put('D', 'D');
        put('e', 'e'); put('E', 'E');
        put('f', 'f'); put('F', 'F');
        put('g', 'g'); put('G', 'G');
        put('h', 'h'); put('H', 'H');
        put('i', 'i'); put('I', 'I');
        put('j', 'j'); put('J', 'J');
        put('k', 'k'); put('K', 'K');
        put('l', 'l'); put('L', 'L');
        put('m', 'm'); put('M', 'M');
        put('n', 'n'); put('N', 'N');
        put('o', 'o'); put('O', 'O');
        put('p', 'p'); put('P', 'P');
        put('q', 'q'); put('Q', 'Q');
        put('r', 'r'); put('R', 'R');
        put('s', 's'); put('S', 'S');
        put('t', 't'); put('T', 'T');
        put('u', 'u'); put('U', 'U');
        put('v', 'v'); put('V', 'V');
        put('w', 'w'); put('W', 'W');
        put('x', 'x'); put('X', 'X');
        put('y', 'y'); put('Y', 'Y');
        put('z', 'z'); put('Z', 'Z');

        put('а', 'а'); put('А', 'А');
        put('б', 'б'); put('Б', 'Б');
        put('в', 'в'); put('В', 'В');
        put('г', 'г'); put('Г', 'Г');
        put('д', 'д'); put('Д', 'Д');
        put('е', 'е'); put('Е', 'Е');
        put('ё', 'ё'); put('Ё', 'Ё');
        put('ж', 'ж'); put('Ж', 'Ж');
        put('з', 'з'); put('З', 'З');
        put('и', 'и'); put('И', 'И');
        put('й', 'й'); put('Й', 'Й');
        put('к', 'к'); put('К', 'К');
        put('л', 'л'); put('Л', 'Л');
        put('м', 'м'); put('М', 'М');
        put('н', 'н'); put('Н', 'Н');
        put('о', 'о'); put('О', 'О');
        put('п', 'п'); put('П', 'П');
        put('р', 'р'); put('Р', 'Р');
        put('с', 'с'); put('С', 'С');
        put('т', 'т'); put('Т', 'Т');
        put('у', 'у'); put('У', 'У');
        put('ф', 'ф'); put('Ф', 'Ф');
        put('х', 'х'); put('Х', 'Х');
        put('ц', 'ц'); put('Ц', 'Ц');
        put('ч', 'ч'); put('Ч', 'Ч');
        put('ш', 'ш'); put('Ш', 'Ш');
        put('щ', 'щ'); put('Щ', 'Щ');
        put('ъ', 'ъ'); put('Ъ', 'Ъ');
        put('ы', 'ы'); put('Ы', 'Ы');
        put('ь', 'ь'); put('Ь', 'Ь');
        put('э', 'э'); put('Э', 'Э');
        put('ю', 'ю'); put('Ю', 'Ю');
        put('я', 'я'); put('Я', 'Я');
    }};
}
