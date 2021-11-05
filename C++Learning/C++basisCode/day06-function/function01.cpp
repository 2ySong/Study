#include "iostream"

using namespace std;

//声明函数
int add(int num1, int num2);

int main() {
    //调用的函数要写到main前面
    cout << add(100, 300) << endl;
    system("pause");
    return 0;
}

int add(int num1, int num2) {
    return num1 + num2;
}