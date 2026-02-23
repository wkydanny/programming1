public class DannyString {

    public static void process() {

        String data = "  John Doe,18,Java Programming  ";

        // ==============================
        // TODO 1 — Remove extra spaces
        // ==============================

        System.out.println("Original length: " + data.length());

        String trimmedData = data.trim();
        System.out.println("Trimmed length: " + trimmedData.length());

        System.out.println();

        // ==============================
        // TODO 2 — Split by comma
        // ==============================

        String[] arr = trimmedData.split(",");

        System.out.println("After split:");
        for (String part : arr) {
            System.out.println(part);
        }

        System.out.println();

        // ==============================
        // TODO 3 — Extract using indexOf + substring
        // ==============================

        int firstComma = trimmedData.indexOf(",");
        int secondComma = trimmedData.indexOf(",", firstComma + 1);

        String name = trimmedData.substring(0, firstComma);
        String age = trimmedData.substring(firstComma + 1, secondComma);
        String course = trimmedData.substring(secondComma + 1);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);

        System.out.println();

        // ==============================
        // TODO 4 — String operations
        // ==============================

        // ----- Using name -----
        System.out.println("First character: " + name.charAt(0));
        System.out.println("First 4 letters: " + name.substring(0, 4));

        // Last name only
        int spaceIndex = name.indexOf(" ");
        String lastName = name.substring(spaceIndex + 1);
        System.out.println("Last name only: " + lastName);

        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        System.out.println();

        // ----- Using course -----
        System.out.println("Equals 'java programming': " + course.equals("java programming"));
        System.out.println("Equals ignore case: " + course.equalsIgnoreCase("java programming"));
        System.out.println("Contains 'Java': " + course.contains("Java"));
        System.out.println("Starts with 'Java': " + course.startsWith("Java"));
        System.out.println("Ends with 'ing': " + course.endsWith("ing"));
        System.out.println("Replace 'a' with '@': " + course.replace("a", "@"));

        System.out.println();

        // ==============================
        // TODO 5 — Final Output Formatting
        // ==============================

        String formattedOutput = String.format(
                "Student Name: %s | Age: %s | Course: %s",
                name, age, course
        );

        System.out.println("Final Formatted Output:");
        System.out.println(formattedOutput);
    }
}