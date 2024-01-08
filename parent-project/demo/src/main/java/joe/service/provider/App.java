package joe.service.provider;

import joe.service.provider.spi.Dictionary;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final DictionaryServiceProvider dictionaryServiceProvider = new DictionaryServiceProvider();
        Dictionary CNDictionary = dictionaryServiceProvider.getDictionary("CN");
        System.out.println(CNDictionary.getDefinition("Hello"));
        Dictionary ENDictionary = dictionaryServiceProvider.getDictionary("US");
        System.out.println(ENDictionary.getDefinition("Hello"));
    }
}
