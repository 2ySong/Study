#include<iostream>
#include<string>//用string初始化字符串时，必须要加这个头文件
using namespace std;
int main(){
    //1. 第一种方式初始化字符串
    char str1[] = "abcde";
    //2. 第二种方式初始化字符串
    string str2 = "abcde";

    cout << "1. 用char str1[] = \"abcde\"初始化的字符串 = " << str1 << endl;
    cout << "2. 用string str2 = \"abcde\"初始化的字符串 = " << str2 << endl;
    system("pause");
    return 0;
}