#include <iostream>
using namespace std;
 
int main()
{
   int a = 21;
   int b = 10;
   int c;
 
   c = a + b;
   cout << "Line 1: a + b =  " << c << endl ;
   c = a - b;
   cout << "Line 2: a - b =  " << c << endl ;
   c = a * b;
   cout << "Line 3: a * b =  " << c << endl ;
   c = a / b;
   cout << "Line 4: a / b =  " << c << endl ;
   c = a % b;
   cout << "Line 5: a % b =  " << c << endl ;
 
   int d = 10;   //  测试自增、自减
   c = d++;
   cout << "Line 6 - c 的值是 " << c << endl ;
 
   d = 10;    // 重新赋值
   c = d--;
   cout << "Line 7: 10-- =  " << c << endl ;
   return 0;
}