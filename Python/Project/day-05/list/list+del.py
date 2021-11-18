list = [0, 1, 2, 3, 4, 5, 6, 7, 8]
print(list.pop(2))
print(list)
print(list.remove(6))
print(list)
list.clear()
print(list)
# 重复元素的删除
list1 = ['1土豆', '2白菜', '3萝卜', '1土豆', '4西红柿', '2白菜', '1土豆', 1, 1, 1]
print(list1)
for i in range(len(list1)):
    for j in list1[i + 1:len(list1)]:
        if list1[i] == j:
            list1.remove(j)
print(list1)
