'''
列表的排序
'''
import random

list = [1, 4, 6, 7, 2, 0, 8, -5]
list.sort()
print(list)
#
list_ran = []
for i in range(8):
    list_ran.append(random.randint(-9, 10))
list_ran.sort(reverse=True)
print(list_ran)
