# Presentation layer

from app import app

def handle(err):
    if hasattr(err, "errno"):
        print("The error number is", err.errno)
        print(err.msg)
    else:
        print("An error occurred:", err)

def nicePrint(result):
    for i, row in enumerate(result):
        print(f"{i+1} -> {row[1]}, {row[0]}")

def main():
    try:
        myApp = app()
        while True:
            n = input("\nHow many names do you want (q to quit)? ").strip().lower()
            if n == "q":
                break
            if not n.isdigit():
                print("Please enter a valid number.")
                continue
            n = int(n)
            if n < 0:
                print("Cannot be negative.")
                continue

            r = myApp.getAuthorNames(n)
            if not r:
                print("No authors found.")
            else:
                nicePrint(r)

            add = input("\nDo you want to add a new author? (y/n): ").strip().lower()
            if add == "y":
                first = input("Enter first name: ").strip()
                last = input("Enter last name: ").strip()
                if first and last:
                    myApp.newAuthorName(first, last)
                    print("Author added successfully.")
                else:
                    print("Names cannot be empty.")

        myApp.done()

    except ValueError as err:
        handle(err)
    except Exception as err:
        handle(err)
    except KeyboardInterrupt:
        print("\nYou typed Ctrl+C — exiting...")

if __name__ == "__main__":
    main()
