public class SBuilder {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder("My name");

        // char at index 0..
        System.out.println(sentence.charAt(0));

        // set char at index ..
        sentence.setCharAt(0, 'm');
        System.out.println(sentence);

        // insert string
        sentence.insert(2, " is tony ");
        System.out.println(sentence);

        // delete string ..
        sentence.delete(2, 4);
        System.out.println(sentence);

        // append string .. add in the end ..
        sentence.append(" is great!");
        System.out.println(sentence);

        // length ..
        System.out.println("Length: " + sentence.length());

        

    }
}
