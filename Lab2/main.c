#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include "main.h"


int main() {
	Array arr;
	createArr(&arr);
	printArr(&arr);
	while (RUNNING) {
		menuExe(menu(), &arr);
	}
	free(arr.array);
	return EXIT_SUCCESS;
}


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
		reverseArr(arr);
		printArr(arr);
		break;
	case RANDOM:
		randomize(arr);
		printArr(arr);
		break;
	case SORT:

		printf(menuPrint[ERROR]);
		break;
	default: 
		printf(menuPrint[ERROR]);
	}
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

void randomize(Array* arr) {
	srand(1964);
	int random = 0, bound = arr->size-1; 

	for (int i = 0; i < arr->size; i++) {
		random = rand() % bound;
		if(i != random)
			swap(&(arr->array[i]), &(arr->array[random]));
	}
}
