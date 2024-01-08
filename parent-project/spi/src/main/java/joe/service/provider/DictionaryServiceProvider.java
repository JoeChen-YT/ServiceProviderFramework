package joe.service.provider;

import joe.service.provider.spi.Dictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

public class DictionaryServiceProvider {
    private Map<String, Dictionary> dictionaryMap;

    public DictionaryServiceProvider() {
        final ServiceLoader<Dictionary> loader = ServiceLoader.load(Dictionary.class);
        final Map<String, Dictionary> dictionaryMap = new HashMap<>();
        Iterator<Dictionary> dictionaryIterator = loader.iterator();
        while(dictionaryIterator.hasNext()) {
            Dictionary dictionary = dictionaryIterator.next();
            dictionaryMap.put(dictionary.getCountryCode(), dictionary);
        }
        this.dictionaryMap = dictionaryMap;
    }

    public Dictionary getDictionary(final String countryCode) {
        return dictionaryMap.get(countryCode);
    }
}
