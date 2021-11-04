package Day_06.HomeWork;

/**
 * 定义 Music类，里面有音乐名name、音乐时长 time属性，并有播放play功能和返回本身属性信息的功能方法 getInfo.
 */
public class HomeWork08 {
    public static void main(String[] args) {
        Music a = new Music("月亮之上",3.5);
        a.play();
        System.out.println(a.getInfo());
        Music b = new Music("时光",5.7);
        b.play();
        System.out.println(b.getInfo());
    }
}
class Music{
    String name;
    double time;
    public Music(String name,double time){
        this.name = name;
        this.time = time;
    }
    //播放功能
    public void play(){
        System.out.println(this.name + "开始播放，播放时长为"+this.time+"分钟");
    }
    //
    public String getInfo(){
        return name+"的音乐时长为"+time+"分钟";
    }
}