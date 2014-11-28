#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main() {
    int fd[2];
    char saludoHijo[]="Hello dad.\0";
    char buffer[80];
    pid_t pid;

pipe (fd);
pid=fork();
        switch(pid)
        {
        case -1://ERROR
        printf("no se ha podido crear el hijo\n");
        exit(-1);
        case 0: //hijo
	close(fd[0]);
	write(fd[1], saludoHijo, strlen(saludoHijo));
        printf("El hijo le dice al padre.%s\n",saludoHijo);
        break;
        default: //padre
	wait(NULL);
        close (fd[1]);
	read(fd[0], buffer, sizeof(buffer));
        printf("El padre lee del hijo.%s\n",saludoHijo);
        break;

        }
}
