#include<iostream>
#include<string>//��string��ʼ���ַ���ʱ������Ҫ�����ͷ�ļ�
using namespace std;
int main(){
    //1. ��һ�ַ�ʽ��ʼ���ַ���
    char str1[] = "abcde";
    //2. �ڶ��ַ�ʽ��ʼ���ַ���
    string str2 = "abcde";

    cout << "1. ��char str1[] = \"abcde\"��ʼ�����ַ��� = " << str1 << endl;
    cout << "2. ��string str2 = \"abcde\"��ʼ�����ַ��� = " << str2 << endl;
    system("pause");
    return 0;
}