//
// Created by szy on 2021/11/3.
//指针和函数
#include "iostream"

using namespace std;

//1. 值传递
void swap1(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    cout << "swap1_a=" << a << ", swap1_b=" << b << endl;
}

//2. 地址传递
void swap2(int *p1, int *p2) {
    int temp = *p1;
    *p1 = *p2;
    *p2 = temp;
    cout << "swap2_a=" << *p1 << ", swap2_b=" << *p2 << endl;
}

int main() {
    //1. 值传递
    int a = 10;
    int b = 100;
    swap1(a, b);
    cout << "1.a=" << a << ", b=" << b << endl;//a=10, b=100;实参并未改变
    //2. 地址传递
    swap2(&a,&b);
    cout << "2.a=" << a << ", b=" << b << endl;//a=100, b=10;实参改变

    return 0;
}

