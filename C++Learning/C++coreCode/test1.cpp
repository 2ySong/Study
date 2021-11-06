/**
 * @Author: Song-zy
 * @Date: 2021/11/5 21:28
 * @Description:
一个公司，有若干名员工，每名员工有姓名，性别，工龄，工资等信息。编
程输入并建立员工档案信息，并要求输出工龄大于 10 年，工资少于 3000 元的所
有男员工信息，输入和输出过程用不同函数实现。
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
        printf("姓名：");
        scanf("%s", ems[i].name);
        printf("性别：");
        scanf("%s", ems[i].gender);
        printf("工龄：");
        scanf("%f", ems[i].workAge);
        printf("工资：");
        scanf("%f", ems[i].salary);
    }
}

void output(Employee *ems) {
    for (int i = 0; i < 3 && ems[i].workAge > 10 && ems[i].salary < 3000; i++) {
        printf("姓名：%s, 性别：%s, 工龄：%d, 工资： %.2f\n",
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