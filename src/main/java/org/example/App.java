package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Tester tester = new Tester("Диана","Голубовская",18,"C2",1000);
        tester.printText("Готово");
        Tester.newTester("Владик","Бурдуков",1219);
        System.out.println( "Hello test branch!" );
        
    }

}
