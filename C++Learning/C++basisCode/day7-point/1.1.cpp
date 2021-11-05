//
// Created by szy on 2021/11/3.
//

#include "iostream"

using namespace std;

int main() {
    int a = 10;
    int *p;
    //让指针记录a的地址
    p = &a;//指针就是地址
    cout << "a的地址：" << &a << endl;//16进制：0x61fe14
    cout << "指针p：" << p << endl;//0x61fe14
//    int c = (int)p;
    // 2、使用指针
    //            可以通过解引用的方式来找到指针指向的内存
    //    指针前加*代表解引用,找到指针指向的内存中的数据
    *p = 0x1f00;//更改值
    cout << *p << endl;//7936
    cout << p << endl;//0x61fe14
    cout << a << endl;//a就是*p
    return 0;
}