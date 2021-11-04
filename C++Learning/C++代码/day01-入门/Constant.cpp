#include<iostream>
using namespace std;
/*
常量讲解，初始化

C++定义常量两种方式
1. # define宏常量：#define  常量名 常量值
   通常在文件上方定义，表示一个常量
2. const修饰的变量：const 数据类型 常量名 = 常量值
   通常在变量定义前加关键字 const，修饰该变量为常量，不可修改
*/

#define week 7//一周有七天，不可更改
const int year = 12;//一年只有12月

int main(){
    // week = 78;//常量不可更改
    cout <<"一周只有" <<week<<"天"<< endl;
    cout <<"一年只有" <<year<<"月"<< endl;
    system("pause");
    return 0;
}