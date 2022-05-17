public class substringTest {

    public static void main(String[] args) {
        String test = "username";
        //String substring = test.substring(5);                     //
        String substring = test.substring(test.length()-4);         //cztery ostatnie znaki w ciagu username
        System.out.println(substring);


    }

}
