#include<iostream>
#include<string>
using namespace std;

int main(){
    //1. 输入一个整型
    int a = 0;
    cout << "1. 请输入一个整型数据：" << endl;
    cin >> a;
    cout << "整型 = " <<  a << endl;

    //2. 输入一个浮点型
    double b = 0;
    cout << "2. 请输入一个浮点型型数据：" << endl;
    cin >> b;
    cout << "浮点型b = " << b << endl;

    //3. 输入一个字符型
    char c = 'A';
    cout << "3. 请输入一个字符型数据：" << endl;
    cin >> c;
    cout << "字符型c = " << c << endl;

    //4. 输入一个字符型
    string d = "琪琪子";
    cout << "4. 请输入一个字符串型数据：" << endl;
    cin >> d;
    cout << "字符串型d = " << d << endl;

    //5. bool数据类型
    bool e = false;
    cout << "5. 请输入一个布尔型数据：" << endl;
    cin >> e;//可以输入数字，除了0都是true
    cout << "布尔型e = " << e <<endl;

    system("pause");
    return 0;
}