package Day_10.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 2:03
 * @Description:
 */
public class Homework08{
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        switch(green){
            case RED:

        }
    }
}

enum Color implements IA{
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0) ,YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    @Override
    public void show() {
        System.out.println(this.name()+"的三种组成颜色：" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue);
    }

}
interface IA {
    void show();
}