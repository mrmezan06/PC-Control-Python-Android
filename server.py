from socket import *
import os
import platform


host = "192.168.0.106"
port = 9999
s = socket(AF_INET, SOCK_STREAM)
s.bind((host, port))
s.listen(5)
while True:
    c, addr = s.accept()
    t = c.recv(1024).decode('utf-8')
    if platform.system() == "Windows":
        if t == 's':
            os.system("shutdown /f")
        elif t == 'm':
            os.system("F:\\Download\\mafiaan.mp4")
        elif t == 'r':
            os.system("shutdown /r")
    elif platform.system() == "Linux":
        if t == 's':
            os.system("shutdown")
        elif t == 'm':
            os.system("~/root/mnt/f:/Download/mafiaan.mp4")
        elif t == 'r':
            os.system("shutdown -r")


