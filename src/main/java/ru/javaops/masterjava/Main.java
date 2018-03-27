package ru.javaops.masterjava;

import ru.javaops.masterjava.xml.util.JaxbParser;

import javax.xml.bind.JAXBException;

/**
 * User: gkislin
 * Date: 05.08.2015
 *
 * @link http://caloriesmng.herokuapp.com/
 * @link https://github.com/JavaOPs/topjava
 */
public class Main {
    public static void main(String[] args) throws JAXBException {
        JaxbParser parser = new JaxbParser();
        Object unmarshal = parser.unmarshal(args[0]);
    }
}
