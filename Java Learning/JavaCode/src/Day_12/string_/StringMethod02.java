package Day_12.string_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/12 18:31
 * @Description:
 */
public class StringMethod02 {
    public static void main(String[] args) {
        String str = "abcDe";
        System.out.println(str.toUpperCase());//ABCDE/转换成大写
        System.out.println(str.toLowerCase());//abcde/转换成小写
        System.out.println(str.concat("F"));//abcDeF/拼接
        System.out.println("abcdebb".replace('b','宋'));//a宋cde宋宋/替换字符串中的字符
        System.out.println("abcdebb".replace("ab","xxx"));//xxxcdebb

        // 5.split 分割字符串, 对于某些分割字符，我们需要 转义比如 | \\等
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        //老韩解读：
        // 1. 以 , 为标准对 poem 进行分割 , 返回一个数组
        // 2. 在对字符串进行分割时，如果有特殊字符，需要加入 转义符 \
        String[] split = poem.split(",");
        poem = "E:\\aaa\\bbb";
        split = poem.split("\\\\");
        System.out.println("==分割后内容===");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        // 6.toCharArray 转换成字符数组
        String s = "happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        // 7.compareTo 比较两个字符串的大小，如果前者大，
        // 则返回正数，后者大，则返回负数，如果相等，返回0
        // 老韩解读
        // (1) 如果长度相同，并且每个字符也相同，就返回 0
        // (2) 如果长度相同或者不相同，但是在进行比较时，可以区分大小
        //     就返回 if (c1 != c2) {
        //                return c1 - c2;
        //            }
        // (3) 如果前面的部分都相同，就返回 str1.len - str2.len
        String a = "jcck";// len1 = 3
        String b = "jack";// len2 = 4
        String c = "ja";//len3=2
        System.out.println(a.compareTo(b)); // 返回值是 'c' - 'a' = 2的值
        System.out.println(b.compareTo(c)); //返回值len2-len3
        System.out.println("abcd".compareTo("dcdfd"));//返回值是 'a' - 'd' = -3的值
        // 8.format 格式字符串
        /* 占位符有:
         * %s 字符串 %c 字符 %d 整型 %.2f 浮点型
         *
         */
        String name = "john";
        int age = 10;
        double score = 56.857;
        char gender = '男';
        //将所有的信息都拼接在一个字符串.
        String info =
                "我的姓名是" + name + "年龄是" + age + ",成绩是" + score + "性别是" + gender + "。希望大家喜欢我！";

        System.out.println(info);


        //老韩解读
        //1. %s , %d , %.2f %c 称为占位符
        //2. 这些占位符由后面变量来替换
        //3. %s 表示后面由 字符串来替换
        //4. %d 是整数来替换
        //5. %.2f 表示使用小数来替换，替换后，只会保留小数点两位, 并且进行四舍五入的处理
        //6. %c 使用char 类型来替换
        String formatStr = "我的姓名是%s 年龄是%d，成绩是%.2f 性别是%c.希望大家喜欢我！";

        String info2 = String.format(formatStr, name, age, score, gender);

        System.out.println("info2=" + info2);

//        toUpperCase
//                toLowerCase
//        concat
//                replace替换字符串中的字符
//        split分割字符串对于某些分割字符,我们需要转义比如|\等
//        案例: String poen="锄禾日当午汗滴禾下土谁知盘中餐粒粒皆辛苦";和文
//                件路径
//        compareTo//比较两个字符串的大小
//        toCharArray/转换成字符数组
//        format/格式字符串,%s字符串%字符%整型%.2f浮点型
//                案例,将一个人的信息格式化输出
    }
}
