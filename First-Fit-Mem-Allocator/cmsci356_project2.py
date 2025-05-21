#KELLY DANG

def print_memory():
    print("".join(lists), end=" ")

def allocate(name, amount):
    count = 0
    start = -1
    for i in range(len(lists)):
        if lists[i] == "-":
            if count == 0:
                start = i
            count += 1
            if count == amount:
                for j in range(start, start + amount):
                    lists[j] = name
                print_memory()
                print(f"Allocated {name} for {amount} bytes.")
                return
        else:
            count = 0
    print_memory()
    print(f"**Insufficient Memory** {name} asked for {amount} bytes.")

def deallocate(name):
    found = False
    for i in range(len(lists)):
        if lists[i] == name:
            lists[i] = "-"
            found = True
    print_memory()
    if found:
        print(f"Freed {name} from memory.")
    else:
        print(f"**Bad Free Attempt** {name} not in memory.")

# Main runner
with open('m1.txt') as file: #File name
    lines = file.read().splitlines()

size = int(lines[0][5:-1])
lists = ["-"] * size

for line in lines[1:]:
    if line.startswith("allocate"):
        parts = line[9:-1].split(",")
        allocate(parts[0], int(parts[1]))
    elif line.startswith("free"):
        deallocate(line[5:-1])
