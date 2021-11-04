#include<iostream>
using namespace std;

/*
转义字符
*/
int main(){
    cout<<"\\"<<endl;//输出的就是'\'
    cout<<"aaa\tbbb\tccc"<<endl;//'\t'会补全8位，作对齐用
    cout<<"a\tb\tc"<<endl;
    system("pause");
    return 0;
}