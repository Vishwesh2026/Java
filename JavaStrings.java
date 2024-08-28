public record JavaStrings() {
    public static void main(String[] args) {
        //String str1 = 'c'; we cannot store char in string  directly.
        String a =""+ 'c';//converting character to string using + operator
        System.out.println("The value of variable a is : " +a);
        String s1 = Character.toString('x');//converts the char to String using method from Character class
        System.out.println(s1);
       System.out.println(Character.isUpperCase('a'));
       System.out.println( Character.isUpperCase('A'));
       System.out.println(Character.isAlphabetic('x'));
       System.out.println(Character.isAlphabetic('X'));
       System.out.println(Character.isWhitespace(' '));
       System.out.println(Character.isWhitespace('#'));
       System.out.println(Character.isDigit('6'));
       System.out.println(Character.isDigit(6));

    }
}
