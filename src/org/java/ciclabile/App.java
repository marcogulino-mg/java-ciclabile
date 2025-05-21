package org.java.ciclabile;

public class App {
    public static void main(String[] args) throws Exception {
        // Context: Attributes
        int[] numbers = { 10, 22, 35 };
        NumberList elencoNumeri = new NumberList(numbers);

        // Context: NumberList Methods callback
        // Note: getElementSuccessivo
        System.out.println(elencoNumeri.getElementoSuccessivo());
        System.out.println(elencoNumeri.getElementoSuccessivo());
        System.out.println(elencoNumeri.getElementoSuccessivo());
    }
}
