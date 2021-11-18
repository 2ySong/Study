'''
列表的添加
    1. append:追加
    2.
'''
list = [1, 2, 3, 4, 5, 6]
print(list)
list.append('白菜')
print(list)
list1 = ['黄瓜']
list2 = list1 + list  # 列表拼接
list1.extend(list)  # 列表拼接，和上面代码一样
print(list2)
