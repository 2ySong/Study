
#include <stdio.h>
#include<string.h>

struct student {
    char name[32];
    int score;
};

int main() {
    int i, j, s1 = 0, s2 = 0;
    struct student a[4][4];
    for (i = 0; i < 4; i++)
        for (j = 0; j < 4; j++) {
            scanf("%s", a[i][j].name);
            scanf("%d", &a[i][j].score);
        }
    for (i = 0; i < 4; i++)
        for (j = 0; j < 4; j++) {
            if (i == j)s1 += a[i][j].score;
            if (i + j == 4)s2 += a[i][j].score;
        }
    printf("主对角线上同学的分数和为%d\n", s1);
    printf("次对角线上同学的分数和为%d\n", s2);
    return 0;
}