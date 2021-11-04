package Day_13.homework;

import java.util.ArrayList;

/**
 * @Author: Song-zy
 * @Date: 2021/10/26 22:13
 * @Description:
 */
@SuppressWarnings("all")
public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新闻一：新冠确诊病例超干万,数百万印度教信徒赴恒河“圣浴”引民众担忧"));
        arrayList.add(new News("新闻二：男子突然想起2个月前钓的鱼还在网兜，捞起一看赶紧放生"));
//        arrayList.add(new News(""));

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}

class News {
    private String headlines;//新闻标题
    private String attributes;//新闻属性

    public News(String headlines) {
        this.headlines = headlines;
    }

    public String getHeadlines() {
        return headlines;
    }

    @Override
    public String toString() {

        if(this.getHeadlines().length()==0){
            return null;
        }
        if (this.getHeadlines().length() >= 15) {
            return this.getHeadlines().substring(0, 15) + "...";//只返回前15个字符
        }
        return headlines;
    }
}