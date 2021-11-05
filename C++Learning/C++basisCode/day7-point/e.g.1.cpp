//
// Created by szy on 2021/11/3.
//

#include "iostream"

using namespace std;

void sort(int *arr, int len) {
    int temp = 0;
    for (int i = 0; i < len - 1; i++) {
        for (int j = 0; j < len - 1 - i; j++) {
//            if (arr[j] > arr[j + 1]) {
//                temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//            }
            if (*(arr + j) > *(arr + j + 1)) {
                temp = *(arr + j);
                *(arr + j) = *(arr + j + 1);
                *(arr + j + 1) = temp;
            }
        }
    }
}

void print_array(int *arr, int len) {
    cout << "Bubble sort: " << endl << "[";
    for (int i = 0; i < len - 1; i++) {
        cout << *(arr + i) << " ,";
    }
    cout << arr[len - 1] << "]" << endl;
}

int main() {
    int arr[10] = {3, 5, 8, 2, 1, -4, 9, 8, 4, 6};
    int length = sizeof(arr) / sizeof(arr[0]);
    sort(arr, length);
    print_array(arr, length);
    return 0;
}