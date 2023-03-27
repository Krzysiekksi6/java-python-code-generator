
def Thread0():
    f

def Thread1():
    g
h

a
if b:
   c
d

else:
   e
thread1 = threading.Thread(target=Thread0)
thread2 = threading.Thread(target=Thread1)
thread1.start()
thread2.start()
thread1.join()
thread2.join()
i
j
