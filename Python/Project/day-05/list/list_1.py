'''
列表
'''
shop_list = ['白菜', '茄子', '猪肉', '土豆', '白菜', 2, True]
print(shop_list[0])
print(shop_list[-4])
print(shop_list[0:3:2])
print(shop_list.count('白菜'))  # 2
print(shop_list[6])
print('*'*10+'遍历1'+'*'*10)
for i in range(len(shop_list)):
    print(shop_list[i])
print('*'*10+'遍历2'+'*'*10)
for i in shop_list:
    print(i)
