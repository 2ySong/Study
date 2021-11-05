//
// Created by szy on 2021/11/3.
// 指针所占内存空间

#include "iostream"

using namespace std;
int main(){
    int a = 10;
    int *p = &a;
    cout<<sizeof(p)<<endl;
    cout<<sizeof(*p)<<endl;
    cout<<sizeof(int*)<<endl;
    return 0;
}