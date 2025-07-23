

public class SubString {
    public static void main(String[] args) {
        String sentence="My name is tony ";
        // substring(begin index, end index)
        String name=sentence.substring(11,sentence.length()-1);
        System.out.println(name);
    }
}

// strings are immutable..