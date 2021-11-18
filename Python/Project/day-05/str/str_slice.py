'''
字符串的切片
'''
str = 'hello'
print(str[0:3:2])  # hl
print(str[1:3])  # el
print(str[:])  # hello
str1 = 'hello' + 'world'
print(str1)  # helloworld
print(str[-3:])  # ll0
print(str[::-2])
print(str.endswith('llo'))
print(str.find('h'))
print(str.rfind('h'))
print(len('hello'))
print('hello'.isalpha())  # True
print('jj88'.isdigit())  # False
print('jjj0'.islower())
print(' '.isspace())
