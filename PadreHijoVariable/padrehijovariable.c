#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>

int main(int argc, char *argv[])
{
pid_t pid1;
int var = 6;
int status1;
pid1=fork();
if ( pid1== 0 )
    { /* hijo */
    var -= 5;
    printf("Soy el hijo, valor de la variable (%d) \n", var);
    }
else
    { /* padre */

 /* Esperamos al primer hijo termine, status 0*/
    waitpid(pid1, &status1, 0);

 /* Esperamos al segundo hijo termine, status 0 */
   // waitpid(pid2, &status2, 0);
    var += 5;
    printf("Soy el padre, valor de la variable (%d) \n", var);
}
return 0;
}
