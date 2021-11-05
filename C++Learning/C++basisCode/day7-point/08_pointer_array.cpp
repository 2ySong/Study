//
// Created by szy on 2021/11/3.
//

#include "iostream"

using namespace std;

int main() {
    int arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int *p = arr;//arr就是数组首地址
    for (int i = 0; i < 10; i++) {
        //三种方式一样的
        cout << arr[i] << endl;
        cout << *(p++) << endl;
        cout << *(arr + i) << endl;
    }
    return 0;
}