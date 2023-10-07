#ifndef MAIN_H_
#define MAIN_H_

typedef struct {
	int size;
	int* array;
}Array;

typedef char* string; 

#define MENU_SIZE 4
#define RUNNING 1
#define MAX_SIZE 50

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
Array* copyArr(Array* arr);
int menu();
void menuExe(int , Array*);


#endif 