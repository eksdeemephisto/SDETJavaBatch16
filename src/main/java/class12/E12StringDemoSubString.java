package class12;

public class E12StringDemoSubString {
    public static void main(String[] args) {
        // subString is used to get a part of the complete String
        String sentence="yup we have another class";
        System.out.println(sentence.substring(4));
        System.out.println(sentence.substring(4,11));
        System.out.println(sentence.substring(12,19));

        int startIndex= sentence.length()-4;
        System.out.println(sentence.substring(startIndex));


    }
}