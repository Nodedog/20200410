
/*
*49.01
*                              String 类  2
*  字符串常见操作
* */


import java.util.Arrays;

public class TestDemo {

    //StringBuffer线程安全
    //StringBuilder线程不安全

    public static void fun(StringBuffer temp) {
        temp.append("\n").append("www.bit.com.cn");
    }
    public static void main(String[] args) {
        //String和StringBuffer最大的区别在于：String的内容无法修改，
        // 而StringBuffer的内容可以修改。频繁修改字符串的情况考虑使用StingBuffer。
        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World");
        fun(sb);
        System.out.println(sb);
    }


    public static void main6(String[] args) {
        String str1 = " hello world " ;
        System.out.println("["+str1+"]");
        //time 可以 去掉字符串开头和结尾的空白字符
        System.out.println("["+str1.trim()+"]");


        //只转换字母
        String str2 = " hello%$$%@#$%world 哈哈哈 " ;
        //字符串转大写
        System.out.println(str2.toUpperCase());
        //字符串转小写
        System.out.println(str2.toLowerCase());




        //获取字符串长度
        System.out.println(str2.length());



        //判断是否为空字符串，但不是null，而是长度为0
        System.out.println("hello".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(new String().isEmpty());


    }

    //字符串的截取
    public static void main5(String[] args) {
        //如果Hello World 中间有空格 也算一个下标
        String str1 = "Hello World";
        //这里6 9 是前闭后开区间 子串包含6的下标，不包含9的下标
        System.out.println(str1.substring(6,9));

        //从6号下标开始一直打印完
        System.out.println(str1.substring(6));

    }

    //字符串拆分
    public static void main4(String[] args) {
        String str1 = "aaa,bb,c";
        String[] arr1 = str1.split(",");
        System.out.println(Arrays.toString(arr1));


        String str2 = "111.222.33.1";
        //String[] arr2 = str2.split(".");
        //这样是不对的 在正则表达式中"." 有特定的含义 如果要切分 . 需要用\.
        //在java 中字符串又不能直接写\ 需要\\表示一个文本\
        //所以 用\\. 表示 .
        String[] arr2 = str2.split("\\.");
        System.out.println(Arrays.toString(arr2));



        //多次拆分
        String str = "name=zhangsan&age=18" ;
        String[] result = str.split("&") ;
        for (int i = 0; i < result.length; i++) {
            String[] temp = result[i].split("=") ;
            System.out.println(temp[0] + " = " + temp[1]);
        }


    }



    //字符串替换
    public static void main3(String[] args) {

        String str1 = "HelloWorld" ;

        //String是不可变对象  replaceAll和replaceFirst都是重新复制了一份然后再替换的
        //无法直接修改替换掉原来的字符串
        String str2 = str1.replaceAll("World","java");
        System.out.println(str2);

        String str3 = str1.replaceFirst("World","java");
        System.out.println(str3);
        //regex 是一个正则表达式
    }



    //字符串查找
    public static void main2(String[] args) {
        String str1 = "llo" ;
        String str2 = "HelloWorld" ;


        //通过contains方法判断str2是否包含str1
        System.out.println(str2.contains(str1));


        //通过indexOf 判断子串是否存在 还能知道子串的位置
        //返回值的数字 表示 str1是在str2 的2号下标位置
        //如果返回-1 则表示 不包含
        //如果出现多个子串 则返回的数字是从左往右第一次出现子串的位置下标
        System.out.println(str2.indexOf(str1));

        //从右往左找子串
        System.out.println(str2.lastIndexOf(str1));

        //startsWith 判断是否是以“Hello”开头
        System.out.println(str2.startsWith("Hello"));

       //endsWith 判断是否以“World”结尾
        System.out.println(str2.endsWith("World"));


    }



    //字符串的比较
    public static void main1(String[] args) {
        String str1 = "hello" ;
        String str2 = "Hello" ;

        //equals 是区分大小写的比较
        System.out.println(str1.equals(str2)); // false


        //equalsIgnoreCase是不区分大小写的比较
        System.out.println(str1.equalsIgnoreCase(str2)); // true

      /*  在String类中compareTo()方法是一个非常重要的方法，该方法返回一个整型，
        该数据会根据大小关系返回三类内容：
        1. 相等：返回0.
        2. 小于：返回内容小于0.
        3. 大于：返回内容大于0。
        */
        //按照字符的UNICODE码来比较   只适用于英文
    }

}
