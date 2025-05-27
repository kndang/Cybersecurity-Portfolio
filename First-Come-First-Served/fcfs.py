# Kelly Dang

# Read file. Change which file you want to read from
text_file = [line.strip() for line in open('p1.txt') if line.strip()]

processes = [line.split() for line in text_file]
processes = [[p[0], int(p[1]), int(p[2])] for p in processes]

# Sort by arrival time
processes.sort(key=lambda x: x[1])

time = 0
output = []

# FCFS
for name, arrival, burst in processes:
    while time < arrival:
        output.append(f"{time} *Free*")
        time += 1

    output.append(f"{time} {name} {arrival} {burst} *STARTING*")
    for _ in range(burst):
        time += 1
        output.append(f"{time} {name}")

output.append(f"{time + 1} *Free*")

# Print the output
for line in output:
    print(line)
