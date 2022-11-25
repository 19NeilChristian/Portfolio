#Queues

class Queue:
    
    def __init__(self):
        self.queue = []
        
    def enqueue(self,val):
        self.queue.insert(0,val)
        
    def dequeue(self):
        if self.is_empty():
            return None
        else:
            return self.queue.pop()
        
    def size(self):
        return len(self.queue)
    
    def is_empty(self):
        return self.size() == 0

def main():

    z = 1
    regx = ''
    x = []
    reg = Queue()

    #Shop Simulation (Menu List is commented below)
    print("\tNSShop Queueing System\n"
          "\t'Register Mode'\n\n")
    while z == 1:
        print("\tSelect an option:\n"
              "A: Enqueue\n"
              "B: Dequeue\n"
              "C: Dequeue entire list\n"
              "D: Display list\n"
              "E: Exit program")
        sel = input(": ")

        if sel == 'A' or sel == 'a':
            regname = input("Name: ")
            reg.enqueue(regname)
            print()
        elif sel == 'B' or sel == 'b':
            regx = reg.dequeue()
            if regx != 'None':
                print(regx)
                order = input("Input the order (Check menu list): ")
                print("Purchase is ready. Customer dequeued.\n")
            else: print()
        elif sel == 'C' or sel == 'c':
            while reg.size() != 0:
                regx = reg.dequeue()
                if regx != 'None':
                    print(regx)
                    order = input("Input the order (Check menu list): ")
                    print("Purchase is ready. Customer dequeued.\n")
                else: print()
        elif sel == 'D' or sel == 'd':
            a = reg.size()
            while a != 0:
                regx = reg.dequeue()
                print(regx)
                reg.enqueue(regx)
                a -= 1
            print()
        elif sel == 'E' or sel == 'e':
            z -= 1

main()

#NSShop Menu List (Input the code only)
#Items (Any field that contains x marks as any number):
#Food = #07xxx
#Appliances = #90xxx
#Gadgets = #82xxx
#Medicines = #10xxx
#End of list. Other item categories are not yet available on this shop list.
