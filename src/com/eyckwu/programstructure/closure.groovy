def isEven = { it%2 == 0 }
assert isEven(3) == false
assert isEven.call(2) == true
