integer =10
float =1.2
char='A'
string = "hello"
array = [9,8,7,6,5,4,3,2,1]
tuple =(1,2,3,4,5)
set = {8,8,8,8,9,9,9,0}
dictionary = {1 : "Apple" , 2 : "Orange" , 3 : "greps"}

print(array);
print(tuple)
print(set)
print(dictionary.values())
print(dictionary.keys())

for index,value in enumerate(set):
    print(index)
    print(value)
for item in range(10):
    if item == 1:
        print("This is the item i was searching")
    elif item == 2:
        print("This is the 2nd item i was searching")
print("loop terminated")

item =5
while item > 1:
    print(item)
    item -=1

"""def testing(name,test=4):
    return "function testing "+name + ": ", test
returnValues,integer= testing("Python")
print(integer)
"""


