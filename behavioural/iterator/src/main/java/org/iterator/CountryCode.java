package org.iterator;

public enum CountryCode {
    IRELAND,
    UK,
    USA,
    CANADA,
    INDIA;

    public static Iterator<CountryCode> iterator() {
        return new CountryCodeIterator();
    }

    private static class CountryCodeIterator implements Iterator<CountryCode> {
        private int position;

        @Override
        public CountryCode next() {
            return CountryCode.values()[position++];
        }

        @Override
        public boolean hasNext() {
            return position < CountryCode.values().length;
        }
    }
}
