//
// Created by szy on 2021/11/3.
//指针常量：特点：指针的指向不可以改，指针==指向的值==可以改
#include "iostream"

using namespace std;

int main() {    int a = 10;
    int b = 30;
    int *const p = &a;
    *p = 40;
    cout << *p << endl;//40
//    p = &b;//不可以更改指针的指向
    cout << p << endl;//0x61fe0c


    return 0;
}