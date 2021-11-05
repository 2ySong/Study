#include <iostream>
using namespace std;
int main()
{
    cout << "===³Ë·¨¿Ú¾÷±í===" << endl;
    for (int i = 1; i < 10; i++)
    {
        for (int j = 1; j < i+1; j++)
        {
            cout << j << " * " << i << " = " << i * j<<", ";
        }
        cout << endl;
    }
    system("pause");
    return 0;
}