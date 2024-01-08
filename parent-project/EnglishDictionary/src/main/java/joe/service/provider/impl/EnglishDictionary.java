package joe.service.provider.impl;

import joe.service.provider.spi.Dictionary;

public class EnglishDictionary implements Dictionary {
    public static final String COUNTRY_CODE = "US";
    @Override
    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    @Override
    public String getDefinition(String word) {
        return "English Word";
    }
}
