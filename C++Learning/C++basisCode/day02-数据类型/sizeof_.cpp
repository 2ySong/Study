#include<iostream>
using namespace std;
/*
    sizeof关键字:
        sizeof(数据类型 / 变量)
*/

int main(){
    cout<<"1. short类型所占的内存空间为"<< sizeof(short) << "字节\n" << endl;
    cout<<"2. int类型所占的内存空间为"<< sizeof(int) << "字节\n" << endl;
    cout<<"3. long类型所占的内存空间为"<< sizeof(long) << "字节\n" << endl;
    cout<<"4. long long类型所占的内存空间为"<< sizeof(long long) << "字节\n" << endl;

    long num = 10;
    cout<<"num内存空间"<< sizeof(num) << endl;//4字节
    system("pause");
    return 0;
}