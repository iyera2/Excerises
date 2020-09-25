public class trim{
    public static void main(String[] args) {
        String first = new String("In a hole in the ground there lives a Hobbit.");
        String second;
        second = first.trim("In a hole   in the ground there lives a Hobbit.");
    }
}