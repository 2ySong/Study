/**
 * @Author: Song-zy
 * @Date: 2021/11/5 21:28
 * @Description:
һ����˾����������Ա����ÿ��Ա�����������Ա𣬹��䣬���ʵ���Ϣ����
�����벢����Ա��������Ϣ����Ҫ������������ 10 �꣬�������� 3000 Ԫ����
����Ա����Ϣ���������������ò�ͬ����ʵ�֡�
 */
#include <stdio.h>
#include <cstring>

struct Employee {
    char name[100];
    char gender[10];
    int workAge;
    double salary;
};

void input(Employee *ems,int size) {
    for (int i = 0; i < size; i++) {
        printf("������");
        scanf("%s", ems[i].name);
        printf("�Ա�");
        scanf("%s", ems[i].gender);
        printf("���䣺");
        scanf("%f", ems[i].workAge);
        printf("���ʣ�");
        scanf("%f", ems[i].salary);
    }
}

void output(Employee *ems) {
    for (int i = 0; i < 3 && ems[i].workAge > 10 && ems[i].salary < 3000; i++) {
        printf("������%s, �Ա�%s, ���䣺%d, ���ʣ� %.2f\n",
               ems[i].name, ems[i].gender, ems[i].workAge, ems[i].salary);
    }
}

int main() {
    int size;
    scanf("%d", &size);
    Employee ems[size];
    input(ems,size);
    output(ems);
    return 0;
}