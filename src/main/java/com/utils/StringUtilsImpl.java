package com.utils;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringUtilsImpl implements StringUtils {

    @Override
    public byte[] ip2Bytes(String ip) {
        return new byte[0];
    }

    @Override
    public String convertIp(String ip) {
        String[] ipParts = ip.split("\\.");
        return Arrays.stream(ipParts)
                .map(this::addRequiredZerosToIp)
                .collect(Collectors.joining("."));
    }

    private String addRequiredZerosToIp(String ip) {
        int maxLength = 4;
        if(ip.length() == maxLength) {
            return ip;
        }
        StringBuilder ipBuilder = new StringBuilder(ip);
        while (ipBuilder.length() < maxLength) {
            ipBuilder.insert(0, "0");
        }
        return ipBuilder.toString();
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
        camelCase.append(words[0]); // first word
        for (String word : words) {
            camelCase.append(capitalize(word));
        }
        return camelCase.toString();
    }

    // remark: analogue org.apache.commons.lang3.StringUtils.capitalize()
    private String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    @Override
    public String fromCamelCase(String camelStr) {
        if (Objects.isNull(camelStr) || camelStr.length() == 0) {
            return camelStr;
        }
        String separatingSymbols = "(?=\\p{Lu})"; // \p{Lu} - an uppercase letter
        String[] words = camelStr.split(separatingSymbols);
        StringJoiner fromCamelCase = new StringJoiner(" ");
        fromCamelCase.add(words[0]); // first word
        for (String word : words) {
            fromCamelCase.add(unCapitalize(word));
        }
        return fromCamelCase.toString();
    }

    private String unCapitalize(String word) {
        return word.substring(0, 1).toLowerCase() + word.substring(1);
    }

}
