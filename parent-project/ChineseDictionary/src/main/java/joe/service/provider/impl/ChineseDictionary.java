package joe.service.provider.impl;

import joe.service.provider.spi.Dictionary;

public class ChineseDictionary implements Dictionary {
    public static final String COUNTRY_CODE = "CN";
    @Override
    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    @Override
    public String getDefinition(String word) {
        return "中国汉字";
    }
}
