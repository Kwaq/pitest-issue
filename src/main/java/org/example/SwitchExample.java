package org.example;

public class SwitchExample {

    public String switchInteger(final Integer input) {
        final String result;

        switch (input) {
            case 1:
                result = "A";
                break;
            case 2:
                result = "B";
                break;
            default:
                throw new IllegalArgumentException("Unsupported input");
        }

        return result;
    }

    public String switchString(final String input) {
        final String result;

        switch (input) {
            case "a":
                result = "A";
                break;
            case "b":
                result = "B";
                break;
            default:
                throw new IllegalArgumentException("Unsupported input");
        }

        return result;
    }
}
