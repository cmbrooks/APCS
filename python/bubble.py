import random

def generate_array(size):
    array = []
    for i in range(0, size):
        array[i] = int(random.random() * 100)
    return array
    
array = generate_array(5)
print array
