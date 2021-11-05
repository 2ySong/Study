#include "iostream"

using namespace std;

int main() {
    //定义指针
    int a = 10;
    int *p;
    //让指针记录a的地址
    p = &a;//指针就是地址
    cout << "a的地址：" << &a << endl;//16进制：0x61fe14
    cout << "指针p：" << p << endl;//0x61fe14
    //使用指针
//    2、使用指针
//            可以通过解引用的方式来找到指针指向的内存
//    指针前加*代表解引用,找到指针指向的内存中的数据
    *p = 1000;//更改地址
    cout << *p << endl;
    return 0;
}