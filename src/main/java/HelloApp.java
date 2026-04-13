public class HelloApp {
    public static void main(String[] args) {
        String name = "World";
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for (String n : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(n);
            first = false;
        }
        if (nameBuilder.length() > 0) {
            name = nameBuilder.toString();
        }
        System.out.println("Hello, " + name + "!");
    }
}