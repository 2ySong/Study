//
// Created by szy on 2021/10/21.
//

#include <iostream>

using namespace std;

int main() {
    int arr1[3] = {1, 2, 5};
    int arr2[] = {1, 2, 3};
    int arr3[6] = {1, 2, 3}; //自动补0
    cout << '[';
    for (int i = 0; i < 3; i++) {
        cout << arr3[i] << " ";
    }
    cout << ']' << endl;
    system("pause");
    return 0;
}