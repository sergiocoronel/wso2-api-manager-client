package uk.co.mruoc.wso2.store.removeapplication;

public class NameToRemoveApplicationQueryStringConverter {

    private static final String QUERY_STRING = "?action=removeApplication&application=%s";

    public String convert(String name) {
        return String.format(QUERY_STRING, name);
    }

}
