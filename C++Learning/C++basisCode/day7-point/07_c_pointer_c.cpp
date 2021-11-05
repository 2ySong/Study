//
// Created by szy on 2021/11/3.
//
#include "iostream"

using namespace std;

int main() {
    int a = 10;
    const int *const p = &a;
    cout << p << endl;//0x61fe14
    cout << *p << endl;//10
    return 0;
}

