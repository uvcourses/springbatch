test= "testing"
print(test[-2]);
tuple=(1,2,3,4,5,5,5)
print(tuple);
set = {10,10,10,9}
print(set)

my_dictionary = { 1: "YUVARAJ", "b":"SAKTHIVEL"}
print(my_dictionary.get("b"))
set_test=frozenset({10,20,30})
print(set_test)


print("Iterating dictionary Values")
for item in my_dictionary.values():
    print(item)
print("Iterating tuples")
for ite in tuple:
    print(ite)

print("iterating set value")
for setItem in set_test:
    print(setItem)

a = [1,3,5,7,9]
b = [2,4,6,8,10]

print("Addition of Two Array")
for A in a:
    for B in b:
        print(A+B)
length =len(a)
print("Addition of Two Array")

for index,value in enumerate(a):
     print(value + b[index])

print(abs(-3))

print(sorted([5,55,25,4,3,0]))
print(sorted(["z","q","ds"]))