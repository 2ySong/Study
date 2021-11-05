//
// Created by szy on 2021/11/3.
//常量指针
#include "iostream"

using namespace std;

int main() {
    int a = 10;
    int b = 30;
    const int *p = &a;
//    *p == 20;//错误写法，const修饰得指针变量，其指向得值不能更改
    cout << *p << endl;//10
    p = &b;
    cout << p << endl;//0x61fe10

    return 0;
}
