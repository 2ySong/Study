# for循环
# for i in range(10):
#     print((i + 1), ': hello ' + str(i))
# for a in range(3, 10):
#     print('*' * 5, str(a))
# for b in range(0,10,3):
#     print(b)
for c in range(1, 5):
    print('*' * c)
    if c == 3:
        break
else:
    print('#'*c)
