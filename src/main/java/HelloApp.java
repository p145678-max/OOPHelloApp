public class HelloApp {
    public static void main(String[] args) {
        String name = "World";
        StringBuilder nameBuilder = new StringBuilder();
        for (String n : args) {
            nameBuilder.append(n).append(", ");
        }
        if (nameBuilder.length() > 0) {
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }
        System.out.println("Hello, " + name + "!");
    }
}