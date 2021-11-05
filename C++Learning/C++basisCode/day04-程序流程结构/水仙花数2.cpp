#include <iostream>
using namespace std;
/*
1^3+5^3+3^=153
*/
int main()
{
    for (int i = 100; i < 1000; i++)
    {
        int n1 = i / 100;          //百位
        int n2 = i / 10 - 10 * n1; //十位
        int n3 = i % 10;           //个位
        if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == i)
        {
            cout << i << endl;
        }
    }

    system("pause");
    return 0;
}