//
// Created by szy on 2021/10/22.
//

#include "iostream"

using namespace std;

int main() {
//    int arr1[][];
    int arr2[2][3] = {{1,2,3},{1,3,5}};
    int arr3[2][3] = {1,2,3,4,5,6};
    int arr4[][3] = {1,2,3,5,6,7};
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            cout<<arr2[i][j]<<" ";
        }
        cout<<endl;
    }

    cout<<"行数："<<sizeof(arr2)/sizeof(arr2[0])<<endl;
    cout<<"列数："<<sizeof(arr2[0])/sizeof(arr2[0][0])<<endl;
    cout<<"长度："<<sizeof(arr2)/sizeof(arr2[0][0])<<endl;
    system("pause");
    return 0;
}