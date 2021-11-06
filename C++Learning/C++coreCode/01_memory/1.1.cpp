/**
 * @Author: Song-zy
 * @Date: 2021/11/5 20:00
 * @Description: 
 */
#include "iostream"

using namespace std;
//全局变量
int c = 20;
int d = 40;
//
const int g = 90;

int main() {
    //局部变量
    int a = 10;
    int b = 10;
    cout << &a << endl;//0x61fe1c
    cout << &b << endl;//0x61fe18
    cout << &c << endl;//0x403010
    cout << &d << endl;//0x403014

    //静态变量
    static int e = 20;
    static int f = 30;
    cout << &e << endl;//0x403018
    cout << &f << endl;//0x40301c
    //常量
    cout << &"hello" << endl;//0x404001
    //const修饰的全局常量
    cout << &g << endl;//0x404004
    return 0;
}