a = 0
while a < 10:
    print(a + 1, '---#')
    a += 1

count = 0
while count < 5:
    print(count, " 小于 5")
    count = count + 1
else:
    print(count, " 大于或等于 5")
# flag = 1
# while (flag): print('欢迎访问菜鸟教程!')

print('1~50之间能被3整除的数字：')
a = 1
while a <= 50:
    if a % 3 == 0:
        print(' ',a)
    a += 1
else:
    print(a)
