class Node:
    def __init__(self,data:any=None) :
        self.data=data
        self.next=None

class Stack:
    def __init__(self,node:Node=None):

        self.node = node
        self.size = 0

    def is_empty(self)->bool:
        return self.size == 0
    
    def push(self,data):
        new_node=Node(data)
        if self.is_empty():
            self.node=new_node
        else:
           cur_node = self.node
           while cur_node.next:
               cur_node=cur_node.next
           cur_node.next=new_node
        self.size += 1



    def pop(self):
        if not self.is_empty():
            if self.size == 1:
                self.node = None
            else:
                cur_node = self.node
                while cur_node.next:
                    cur_node = cur_node.next
                cur_node.next = None
                self.size -= 1


    def peek(self):
        if self.is_empty():
            print('Stack is empty')
        else:
            cur_node = self.node
            while cur_node.next:
                cur_node = cur_node.next
            return cur_node.data
        

    def print_stack(self):
        if self.is_empty():
            print('Stack is empty')
        else:
            cur_node = self.node
            while cur_node is not None:
                print(cur_node.data, end=' -> ')
                cur_node = cur_node.next
            print('None')

####################################

myStack=Stack()
print('Is stack empty',myStack.is_empty())  #True
print('Stack size:', myStack.size)
myStack.push('Jack')
myStack.print_stack()
myStack.push('John')
myStack.print_stack()
myStack.push('Joe')
myStack.print_stack()
myStack.push('Jane')
myStack.print_stack()
print('Stack size:', myStack.size)
myStack.push('Jim')
myStack.print_stack()
print('Stack size:', myStack.size)
print('Top element is:', myStack.peek())
myStack.pop()
myStack.print_stack()

