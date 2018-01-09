package utils;

public class Properties {
    private static final String DEFAULT_BASE_URL = "https://rozetka.com.ua/mobile-phones/c80003/";

    public static String getBaseUrl() {
        return System.getProperty(EnvironmentVariables.BASE_URL.toString(), DEFAULT_BASE_URL);
    }

    enum EnvironmentVariables {
        BASE_URL("env.url");


        private String value;

        EnvironmentVariables(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
