#ifndef LAB2_H_
#define LAB2_H_

typedef struct {
	int size;
	int* array;
}Array;

typedef char* string; 
typedef void (*PTR_FUNC)(void*); 

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
//Include the keyword static for variables made in .h file. 
static char* menuPrint[] = {
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
void sort(Array*);
Array* copyArr(Array* arr);
int menu();
void menuExe(int , Array*);

static PTR_FUNC options[] = {
	NULL,
	reverseArr,
	randomize,
	sort
};

#endif 