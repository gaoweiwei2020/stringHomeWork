
import org.testng.annotations.Test;

public class testString {
    @Test
    public void testString() {
        String s1 = "";
        String s2 = "hello this is a string";
        String s3;
        s3 = new String("string by new");


        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello" + "world";

        String str4 = str2 + "world";

        String str5 = new String("hello");
        String str6 = new String("hello");

        String str7 = str6.intern();

        String str8 = new String("hello").intern();


        System.out.println("str1 = str2, " + (str1 == str2));
        System.out.println("str3 = str4, " + (str3 == str4));
        System.out.println("str1 = str5, " + (str1 == str5));
        System.out.println("str5 = str6, " + (str5 == str6));
        System.out.println("str1 = str7, " + (str1 == str7));

        System.out.println("str1 = str8, " + (str1 == str8));

        String str9 = "hello";
        str9 += "world";
        System.out.println("str3 = str9, " + (str3 == str9));

    }


    @Test
    public void testStringLength() {
        String str = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str);
        System.out.println("length is : " + str.length());


        System.out.println("code point count is:"+str.codePointCount(0 , str.length()));

    }



    @Test
    public void testStrSub() {

        String str = "hello , world";
        String str1 = str.substring(2);
        System.out.println(str1);

        System.out.println(str.substring(0 ,1));
        System.out.println(str.substring(0 ,str.length()-1));
        System.out.println(str.substring(0 ,str.length()+1));
    }

        @Test
        public void testStringAdd() {
            String str = "hello" + "world";
            str += "!";
            str = str + "444";
            System.out.println(str);


        }


        @Test
        public void testFormat() {
            System.out.printf("hello, %s %n", "world");
            System.out.printf("大写a: %c %n", 'A');
            System.out.printf("100>50: %b %n", 100>50);
            System.out.printf("100除以2, %d %n", 100/2);
            System.out.printf("100的16进制 %x %n", 100);
            System.out.printf("100的8进制 %o %n", 100);
            System.out.printf("100的8.5折扣是 %f 元%n", 50*0.85);
            System.out.printf("上述价格的16进制是 %a %n", 50*0.85);
            System.out.printf("上面的折扣是%d%% %n", 85);

        }




}
