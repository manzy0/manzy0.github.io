
def xyzMiddle(string):
    #get the length of the string
    length = len(string)
    
    #find the middle position
    if length % 2 == 1:
        #odd length: middle is at length / 2
        middle = length //2
    else:
        #even length: middle is at (length / 2) -1
        middle = (length // 2) - 1
    
    #get substring middle -1 and middle + 2 and check if it equals "xyz"
    return string[middle - 1 : middle + 2] == "xyz"
    
    
#test
print(xyzMiddle("AAxyzBB")) #true
print(xyzMiddle("AxyzBB"))  #true
print(xyzMiddle("AxyzBBB")) #false
print(xyzMiddle("AabcB"))   #false
print(xyzMiddle("yzxyzxy")) #true
print(xyzMiddle("nnopenm")) #false
print(xyzMiddle("AzyxA"))   #false
print(xyzMiddle("xyz"))     #true
