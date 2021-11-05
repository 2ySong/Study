//
// Created by szy on 2021/11/3.
//野指针
#include "iostream"

using namespace std;

int main() {
    int *p = (int *) 0x1d00;
    cout << p << endl;
    return 0;
}

