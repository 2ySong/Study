#include <iostream>
using namespace std;
/*案例描述:从1开始数到数字100,如果数字个位含有7,或者数字十位含有7,
或者该数字是7的倍数,我们打印
敲桌子,其余数字直接打印输出。
*/
int main()
{
    int n1,n2;
    for (int i = 0; i < 100; i++)
    {
        n1 = i / 10; //十位
        n2 = i % 10; //个位
        if ((n1 == 7 || n2 == 7 || i % 7 == 0) && i != 0)
        {
            cout << i << endl;
        }
    }
    system("pause");
    return 0;
}