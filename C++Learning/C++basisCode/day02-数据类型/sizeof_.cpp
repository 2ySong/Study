#include<iostream>
using namespace std;
/*
    sizeof�ؼ���:
        sizeof(�������� / ����)
*/

int main(){
    cout<<"1. short������ռ���ڴ�ռ�Ϊ"<< sizeof(short) << "�ֽ�\n" << endl;
    cout<<"2. int������ռ���ڴ�ռ�Ϊ"<< sizeof(int) << "�ֽ�\n" << endl;
    cout<<"3. long������ռ���ڴ�ռ�Ϊ"<< sizeof(long) << "�ֽ�\n" << endl;
    cout<<"4. long long������ռ���ڴ�ռ�Ϊ"<< sizeof(long long) << "�ֽ�\n" << endl;

    long num = 10;
    cout<<"num�ڴ�ռ�"<< sizeof(num) << endl;//4�ֽ�
    system("pause");
    return 0;
}