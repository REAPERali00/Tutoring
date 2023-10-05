#ifndef MAIN_H_
#define MAIN_H_

typedef struct {
	int size;
	int* array;
}Array;

#define MENU_SIZE 4
#define RUNNING 1

enum options {
	EXIT, 
	REVERSE, 
	RANDOM, 
	SORT, 
	ERROR
};
char* menuPrint[] = {
	"(%d) : exit\n",
	"(%d) : reverse array\n",
	"(%d) : randomize array\n",
	"(%d) : sort array\n", 
	"Sorry, this option is not available yet\n"
};

void createArr(Array* );
void printArr(Array* );
void swap(int* , int* );
void reverseArr(Array* );
void randomize(Array* );
int menu();
void menuExe(int , Array*);


#endif 