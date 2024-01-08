package joe.service.provider.spi;

public interface Dictionary {
    String getCountryCode();
    String getDefinition(final String word);
}
