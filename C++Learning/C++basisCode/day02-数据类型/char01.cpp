#include<iostream>
using namespace std;
int main(){
    char ch = 'a';
    int i = (int)ch;//i=97
    cout<< "ch = "<< ch << endl;//a
    cout<< "ch¶ÔÓ¦ASCIIÖµ = "<< (int)ch << endl;//97
    cout<< "charÀàÐÍËùÕ¼µÄÄÚ´æ¿Õ¼ä="<< sizeof(char)<<"×Ö½Ú" << endl;

    char ch1 = 'A';//65
    system("pause");
    return 0;
}