package com.utils;

import java.util.Objects;

public class StringUtilsImpl implements StringUtils {

    @Override
    public byte[] ip2Bytes(String ip) {
        return new byte[0];
    }

    @Override
    public String convertIp(String ip) {
        return null;
    }

    @Override
    public StringBuilder alphabet() {
        char startSymbol = 'a'; // ASCII 97
        char endSymbol = 'z'; // ASCII 122
        StringBuilder alphabet = new StringBuilder();
        for (char symbol = startSymbol; symbol <= endSymbol; symbol++) {
            if (symbol % 2 == 0) {
                alphabet.append(Character.toUpperCase(symbol));
            } else {
                alphabet.append(symbol);
            }
        }
        return alphabet;
    }

    @Override
    public String[] uri2Array(String uri) {
        return new String[0];
    }

    @Override
    public String toCamelCase(String str) {
        if (Objects.isNull(str) || str.length() == 0) {
            return str;
        }
        String separatingSymbols = "[\\s,]+"; // space or comma one or more times
        String[] words = str.toLowerCase().split(separatingSymbols);
        StringBuilder camelCase = new StringBuilder();
        camelCase.append(words[0]);
        for (String word : words) {
            camelCase.append(capitalize(word));
        }
        return camelCase.toString();
    }

    // remark: analogue org.apache.commons.lang3.StringUtils.capitalize()
    private String capitalize(String word) {
        if (Objects.isNull(word) || word.length() == 0) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    @Override
    public String fromCamelCase(String camelStr) {
        return null;
    }

}
