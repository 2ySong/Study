#include<iostream>
using namespace std;
/*
    1. float��������
    2. double��˫����
*/

int main(){
    float f1 = 3.14f;
    double d1 = 3.14;

    cout<<"1. float������ռ���ڴ�ռ�Ϊ"<< sizeof(float) << "�ֽ�\n" << endl;//4�ֽ�
    cout<<"2. double������ռ���ڴ�ռ�Ϊ"<< sizeof(double) << "�ֽ�\n" << endl;//8�ֽ�

    //��ѧ������
    float f2 = 3e-2;//3*10^2
    cout<< "f2=" << f2 <<endl;

    system("pause");
    return 0;
}