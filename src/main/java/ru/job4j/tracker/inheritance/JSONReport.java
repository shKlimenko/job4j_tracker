package ru.job4j.tracker.inheritance;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "{"
                + System.lineSeparator()
                + "    \"" + name + "\" : \"name\","
                + System.lineSeparator()
                + "    \"" + body + "\" : \"body\""
                + System.lineSeparator()
                + "}";
    }

    public static void main(String[] args) {
        JSONReport repa = new JSONReport();
        String text = repa.generate("name", "body");
        System.out.println(text);
    }
}
