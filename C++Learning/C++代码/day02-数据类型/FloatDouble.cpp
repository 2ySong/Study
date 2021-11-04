#include<iostream>
using namespace std;
/*
    1. float：单精度
    2. double：双精度
*/

int main(){
    float f1 = 3.14f;
    double d1 = 3.14;

    cout<<"1. float类型所占的内存空间为"<< sizeof(float) << "字节\n" << endl;//4字节
    cout<<"2. double类型所占的内存空间为"<< sizeof(double) << "字节\n" << endl;//8字节

    //科学计数法
    float f2 = 3e-2;//3*10^2
    cout<< "f2=" << f2 <<endl;

    system("pause");
    return 0;
}