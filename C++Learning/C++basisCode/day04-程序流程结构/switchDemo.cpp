#include <iostream>
using namespace std;

int main()
{
  // �ֲ���������
  int a = 100;
  int b = 200;

  switch (a)
  {
  case 100:
    cout << "�����ⲿ switch ��һ����" << endl;
    switch (b)
    {
    case 200:
      cout << "�����ڲ� switch ��һ����" << endl;
    }
  }
  cout << "a ��׼ȷֵ�� " << a << endl;
  cout << "b ��׼ȷֵ�� " << b << endl;

  return 0;
}