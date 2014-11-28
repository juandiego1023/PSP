int main(){

	int fp;
	char saludo[]="Un saludo!!!!!";
	fp=open("FIFO1",1);


if(fp==-1)
	{
	printf ("ERROR AL ABRIR EL ARCHIVO\n");
	exit(1);
	}
printf("mandando informacion al fifo..\n");
write (fp,saludo,strlen(saludo));
close(fp);
