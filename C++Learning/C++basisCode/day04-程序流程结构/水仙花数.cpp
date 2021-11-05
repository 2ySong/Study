#include <iostream>
using namespace std;
/*
1^3+5^3+3^=153
*/
int main()
{
    cout << "本程序判断一个数是否为水仙花数" << endl;
    int num = 0;
    do
    {
        printf("请输入一个数：");
        cin >> num;
        int n1 = num / 100;          //百位
        int n2 = num / 10 - 10 * n1; //十位
        int n3 = num % 10;           //个位
        if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == num)
        {
            cout << num << "是一个水仙花数" << endl;
        }
        else
        {
            cout << num << "不是一个水仙花数" << endl;
        }
    } while (num < 1000);
    system("pause");
    return 0;
}