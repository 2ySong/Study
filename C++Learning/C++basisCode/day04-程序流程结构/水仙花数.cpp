#include <iostream>
using namespace std;
/*
1^3+5^3+3^=153
*/
int main()
{
    cout << "�������ж�һ�����Ƿ�Ϊˮ�ɻ���" << endl;
    int num = 0;
    do
    {
        printf("������һ������");
        cin >> num;
        int n1 = num / 100;          //��λ
        int n2 = num / 10 - 10 * n1; //ʮλ
        int n3 = num % 10;           //��λ
        if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == num)
        {
            cout << num << "��һ��ˮ�ɻ���" << endl;
        }
        else
        {
            cout << num << "����һ��ˮ�ɻ���" << endl;
        }
    } while (num < 1000);
    system("pause");
    return 0;
}