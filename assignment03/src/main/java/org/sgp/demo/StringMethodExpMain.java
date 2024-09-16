package org.sgp.demo;

public class StringMethodExpMain {
    public static void main(String [] args) {
        String myQuote1 = "Find a way";
        String myQuote2 = "not an excuse";
        String fullName = "Suma Gopal Poojari";

        System.out.println("Length of the quote 1 is " + myQuote1.length()); //sentence length
        System.out.println("Length of the quote 2 is " + myQuote2.length());
        System.out.println(myQuote1.toLowerCase()); //sentence in lowercase
        System.out.println(myQuote2.toUpperCase());//sentence in uppercase
        System.out.println(myQuote1.concat(" ").concat(myQuote2));

        //to check a string contains a particular char,substring or string
        if(myQuote1.contains("not")) {
            System.out.println("First sentence has 'not' in it");
        }
        else if(myQuote2.contains("not")){
            System.out.println("Second sentence has 'not' in it");
        }

        //to check a string ends with particular substring
        if(myQuote1.endsWith("excuse")) {
            System.out.println("First sentence ends with 'excuse'");
        }
        else if(myQuote2.endsWith("excuse")){
            System.out.println("Second sentence ends with 'excuse'");
        }

        System.out.println(myQuote1.charAt(8));//returns char at index 8
        System.out.println(myQuote1.indexOf("an"));
        System.out.println(myQuote2.indexOf("an"));//returns index of 1st char of mentioned string
        System.out.println(myQuote1.lastIndexOf("a"));
        System.out.println(myQuote1.replace("way","solution"));

        System.out.println("My full name is "+fullName);
        //System.out.println("My first name is "+fullName.);
        //System.out.println("My middle name is "+fullName);
        //System.out.println("My last name is "+fullName);

    }
}
