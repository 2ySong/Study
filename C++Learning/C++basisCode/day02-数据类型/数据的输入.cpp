#include<iostream>
#include<string>
using namespace std;

int main(){
    //1. ����һ������
    int a = 0;
    cout << "1. ������һ���������ݣ�" << endl;
    cin >> a;
    cout << "���� = " <<  a << endl;

    //2. ����һ��������
    double b = 0;
    cout << "2. ������һ�������������ݣ�" << endl;
    cin >> b;
    cout << "������b = " << b << endl;

    //3. ����һ���ַ���
    char c = 'A';
    cout << "3. ������һ���ַ������ݣ�" << endl;
    cin >> c;
    cout << "�ַ���c = " << c << endl;

    //4. ����һ���ַ���
    string d = "������";
    cout << "4. ������һ���ַ��������ݣ�" << endl;
    cin >> d;
    cout << "�ַ�����d = " << d << endl;

    //5. bool��������
    bool e = false;
    cout << "5. ������һ�����������ݣ�" << endl;
    cin >> e;//�����������֣�����0����true
    cout << "������e = " << e <<endl;

    system("pause");
    return 0;
}