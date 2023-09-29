class employee:
    def __init__(self,value):
        self.some_value=value;

    def testingMethod(self):
        print(self.some_value)
    @staticmethod
    def staticMethod():
        print("this is static method")

obj=employee(10)
print("printing object value ",obj.testingMethod())
employee.staticMethod()