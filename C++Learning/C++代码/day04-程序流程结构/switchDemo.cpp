#include <iostream>
using namespace std;

int main()
{
  // 局部变量声明
  int a = 100;
  int b = 200;

  switch (a)
  {
  case 100:
    cout << "这是外部 switch 的一部分" << endl;
    switch (b)
    {
    case 200:
      cout << "这是内部 switch 的一部分" << endl;
    }
  }
  cout << "a 的准确值是 " << a << endl;
  cout << "b 的准确值是 " << b << endl;

  return 0;
}