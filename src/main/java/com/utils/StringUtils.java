package com.utils;

public interface StringUtils {

    /**
     *
     * @param ip
     * @return byte array converted from ip
     */
    byte[] ip2Bytes(String ip);

    /**
     *
     * @param ip
     * @return a line in which each digit separated by a dot has the required number of zeros added to it
     * @Example: 1.2.3.4 => 001.002.003.004
     */
    String convertIp(String ip);

    /**
     *
     * @return string of alphabets in which the even numbered letters are upper and the odd numbered letters are not upper
     */
    StringBuilder alphabet();

    /**
     * <схема>:[//[<логин>[:<пароль>]@]<хост>[:<порт>]][/<URL‐путь>][?<параметры>][#<якорь>]
     * @param uri
     * @return an array of strings with each element in its place as in the diagram, if the element is missing in the given string then insert a null (try to use regex)
     */
    String[] uri2Array(String uri);

    /**
     *
     * @param str (string separated by spaces and commas)
     * @return camelCase string
     */
    String toCamelCase(String str);

    String fromCamelCase(String camelStr);

}
