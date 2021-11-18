words = 'Jack,Tom,Smith,Mary'
# 根据','切割
names = words.split(',')
print(names[0])  # Jack
print(names[2])  # Smith

# 字符串元素的替换
oldWord = 'abcdeFab'
newWord = oldWord.replace('ab', 'SZY')
print(newWord)  # SZYcdeFSZY
#
word = 'aCDEFabHHHab'
print(word.strip('ab'))  # CDEFabHHH
#
word = 'hello'
print(','.join(word)) #h,e,l,l,o
