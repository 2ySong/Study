'''
冒泡排序
'''
list = [12, 3, 4, 5, -4, 0, 67, -3, 55]
# 冒泡排序
for i in range(len(list) - 1):
    for j in range(len(list) - 1 - i):
        if list[j] < list[j + 1]:  # <为降序，>为升序
            list[j], list[j + 1] = list[j + 1], list[j]
print(list)
a = 1
b = 2
c = 3
a, b, c = c, a, b
print(a,b,c)
