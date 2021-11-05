//
// Created by szy on 2021/11/3.
//空指针：用于给指针变量初始化；不可访问

#include "iostream"

using namespace std;

int main() {
    int *p = NULL;
//    *p=100;
    cout<<*p<<endl;
    return 0;
}