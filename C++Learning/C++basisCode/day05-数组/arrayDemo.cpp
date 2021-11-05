#include <iostream>
using namespace std;
int main()
{
    int arr1[3] = {1, 2, 5};
    int arr2[] = {1, 2, 3};
    int arr3[6] = {1, 2, 3}; //×Ô¶¯²¹0
    cout << '[';
    for (int i = 0; i < 3; i++)
    {
        cout << arr3[i] << " ";
    }
    cout << ']' << endl;
    system("pause");
    return 0;
}