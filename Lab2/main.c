#include <stdlib.h>
#include <stdio.h>


typedef struct {
	int size;
	int* array;
}Array;

#define MENU_SIZE 4
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


int menu() {
	printf("Choose an option:\n");
	for (int i = 0; i < MENU_SIZE; i++) {
		printf(menuPrint[i], i);
	}
	int choice = 0; 
	scanf_s("%d", &choice); 
	return choice; 
}

void menuExe(int choice, Array* arr) {

	switch (choice) {
	case EXIT:
		printf("Bye!\n");
		exit(EXIT_SUCCESS);
		break;
	case REVERSE:
		reverseArr(&arr);
		printArr(&arr);
		break;
	case RANDOM:

		printf(menuPrint[ERROR]);
		break;
	case SORT:

		printf(menuPrint[ERROR]);
		break;
	default: 
		printf(menuPrint[ERROR]);
	}
}
int main() {
	Array arr;
	menu();
	//createArr(&arr);
	//printArr(&arr);
	//reverseArr(&arr);
	//printArr(&arr);
	return EXIT_SUCCESS;


}

void createArr(Array* arr) {

	printf("Enter the length: ");
	if (scanf_s("%d", &(arr->size)) == 0) {
		printf("Invalid input\n");
		exit(EXIT_FAILURE);
	}
	if (arr->size <= 0) {
		printf("Invalid size\n");
		exit(EXIT_FAILURE);
	}
	arr->array = (int*)malloc(arr->size * sizeof(int));
	printf("Enter %d nubmers (Space seperated)\n", arr->size);
	for (int i = 0; i < arr->size; i++) {
		scanf_s("%d", (arr->array + i));
	}

}

void printArr(Array* arr) {
	printf("{ ");
	for (int i = 0; i < arr->size; i++) {
		printf("%d ", arr->array[i]);
	}
	printf("}\n");
}

void swap(int* n, int* m) {
	int temp = 0;
	temp = *n;
	*n= *m;
	*m = temp;

}

void reverseArr(Array* arr) {
	for (int i = 0; i < arr->size / 2; i++) {
		swap(&(arr->array[i]), &(arr->array[arr->size - 1 - i]));
	}
}

