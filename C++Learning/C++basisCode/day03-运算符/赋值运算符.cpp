#include <iostream>
using namespace std;

int main()
{
    int a = 21;
    int c;

    c = a;
    cout << "a = 21; c = a; c 的值 =  " << c << endl; //21

    c = 0;
    c += a;
    cout << "a = 21; c += a; c 的值 =  " << c << endl; //21
    c = 0;
    c -= a;
    cout << "a = 21; c -= a; c 的值 =  " << c << endl; //-21

    c = 0;
    c *= a;
    cout << "a = 21; c *= a; c 的值 =  " << c << endl; //0

    c = 42;
    c /= a;
    cout << "a = 21; c = 42; c /= a; c 的值 =  " << c << endl; //2

    c = 200;
    c %= a;
    cout << "a = 21; c=200; c %= a; c 的值 =  " << c << endl; //11

    c = 15;
    c <<= 2;
    cout << "c = 15; c <<=2; c 的值 =  " << c << endl;//400

    c = 15;
    c >>= 2;
    cout << "c = 15; c >>= 2; c 的值 =  " << c << endl;//60

    c = 1;
    c &= 2;
    cout << "c = 1; c &= 2; c 的值 =  " << c << endl;//1

    c = 1;
    c ^= 2;
    cout << "c = 1; c ^= 2; c 的值 =  " << c << endl; //3

    c = 1;
    c |= 2;
    cout << "c = 1; c |=2; c 的值 =  " << c << endl; //2

    system("pause");
    return 0;
}