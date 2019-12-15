
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

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


            String str1 = String.format("%d" , 0xffff);
            String str2 = String.format("%x" , 0xffff);
            String str3 = String.format("%s" , 0xffff);
            //String str4 = String.format("%f" , 0xffff);
            String str5 = String.format("%o" , 0xffff);
            String str6 = String.format("%b" , 0xffff);
            String str7 = String.format("%c" , 65);
            String str8 = String.format("%d%%" , 55);
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            //System.out.println(str4);
            System.out.println(str5);
            System.out.println(str6);
            System.out.println(str7);
            System.out.println(str8);
        }

        @Test
        public void testEquals() {
            String str = "hello";
            String str1 = new String("hello");
            System.out.println(str.equals("Hello"));   //默认比较引用，被包装类重写变成值比较


            System.out.println(str.equalsIgnoreCase("Hello"));

            System.out.println(str.startsWith("a"));

            System.out.println(str.startsWith("he"));

            System.out.println(str.endsWith("rrr"));
            System.out.println(str.endsWith("llo"));


            System.out.println(str.contains("llo"));




        }



        @Test
        public void testIndexof() {
            String str = "hello, world!";

            int index = -1 ;
            do{
                int a1 = str.indexOf("o",index +1);
                if(a1 == -1){
                    break;
                }
                System.out.println(String.format("第 %d 为是小写字母o",a1+1));
                index = a1 ;
            }while(true);

            System.out.println(str.indexOf("e"));
            System.out.println(str.indexOf('e'));
            System.out.println(str.indexOf(101));

            System.out.println(str.indexOf("e", 2));  //  找谁从第几个开始找  如果不写第二个，则从第0个开始找

            System.out.println(str.indexOf("l"));
            System.out.println(str.lastIndexOf("l"));
            System.out.println(str.lastIndexOf("l", 9));
        }


        @Test
        public void testReplace() {
            System.out.println("hello , world".replace('l' , 'z'));
            System.out.println("hello , world".replace("l" , "x"));
            System.out.println("hello , world".replaceAll("o" , "b"));
        }


        @Test
        public void testSpace() {
            System.out.println(" hello ,   world ".trim().toUpperCase());
            System.out.println(" HELLO ,   world ".toLowerCase());
        }

        @Test
        public void testNewSb() {
            String str = "hello";
            str += ",";
            str += "world";
            str += ".";
            System.out.println(str);

            StringBuilder str1 = new StringBuilder();
            System.out.println(str1);
            str1.append("hello");
            str1.append('.');
            str1.append("world");
            str1.append(".");
            System.out.println(str1.toString());

            str1.setLength(10);  //设置长度
            System.out.println(str1.toString());

            str1.setLength(20);  //设置长度
            System.out.println(str1.toString());
        }



        @Test
        public void testRemoveSpace() {


            String s1 = "hello" + ", world!";
            String s2 = "hello";
            s2 += ", world!";
            String s3 = "hello, world!";
            String s4 = s2.intern();
            System.out.println(s1 == s2);
            System.out.println(s1 == s3);
            System.out.println(s1 == s4);
            System.out.println(s2 == s3);
            System.out.println(s2 == s4);


        }













}
