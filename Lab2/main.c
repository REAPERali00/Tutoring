//#include <stdlib.h>
//#include <stdio.h>
//#include <time.h>
//#include "main.h"
//
//
//int main2() {
//	Array arr;
//	createArr(&arr);
//	printArr(&arr);
//	Array* copy;
//	while (RUNNING) {
//		copy = copyArr(&arr);
//		menuExe(menu(), &copy);
//	}
//	free(arr.array);
//	return EXIT_SUCCESS;
//}
//
//
//int menu() {
//	printf("Choose an option:\n");
//	for (int i = 0; i < MENU_SIZE; i++) {
//		printf(menuPrint[i], i);
//	}
//	int choice = 0; 
//	scanf_s("%d", &choice); 
//	return choice; 
//}
//
//void menuExe(int choice, Array* arr) {
//	switch (choice) {
//	case EXIT:
//		printf("Bye!\n");
//		exit(EXIT_SUCCESS);
//		break;
//	case REVERSE:
//		reverseArr(arr);
//		printArr(arr);
//		break;
//	case RANDOM:
//		randomize(arr);
//		printArr(arr);
//		break;
//	case SORT:
//
//		printf(menuPrint[ERROR]);
//		break;
//	default: 
//		printf(menuPrint[ERROR]);
//	}
//}
//
//void createArr(Array* arr) {
//
//	printf("Enter the length: ");
//	if (scanf_s("%d", &(arr->size)) == 0) {
//		printf("Invalid input\n");
//		exit(EXIT_FAILURE);
//	}
//	if (arr->size <= 0) {
//		printf("Invalid size\n");
//		exit(EXIT_FAILURE);
//	}
//	//else if (arr->size > MAX_SIZE) {
//	//	printf("Too Big\n"); 
//	//	createArr(arr);
//	//}
//	arr->array = (int*)malloc(arr->size * sizeof(int));
//	printf("Enter %d nubmers (Space seperated)\n", arr->size);
//	for (int i = 0; i < arr->size; i++) {
//		scanf_s("%d", (arr->array + i));
//	}
//
//}
//
//void printArr(Array* arr) {
//	printf("{ ");
//	for (int i = 0; i < arr->size; i++) {
//		printf("%d ", arr->array[i]);
//	}
//	printf("}\n");
//}
//
//void swap(int* n, int* m) {
//	int temp = 0;
//	temp = *n;
//	*n= *m;
//	*m = temp;
//
//}
//
//void reverseArr(Array* arr) {
//	for (int i = 0; i < arr->size / 2; i++) {
//		swap(&(arr->array[i]), &(arr->array[arr->size - 1 - i]));
//	}
//}
//
//void randomize(Array* arr) {
//	srand(1964);
//	int random = 0, bound = arr->size-1; 
//
//	for (int i = 0; i < arr->size; i++) {
//		random = rand() % bound;
//		if(i != random)
//			swap(&(arr->array[i]), &(arr->array[random]));
//	}
//}
//
//Array* copyArr(Array* arr) {
//	Array* copy = (Array*)malloc(sizeof(Array));
//	if (copy == NULL) {
//		printf("Couldn't create the Array\n"); 
//		return NULL;
//	}
//	copy->array = (int*)malloc(arr->size * sizeof(int));
//
//	if (copy->array == NULL) {
//		printf("Error, could not create the copied array\n");
//		free(copy); 
//		return NULL;
//	}
//
//	copy->size = arr->size;
//	for (int i = 0; i < arr->size; i++) {
//		copy->array[i] = arr->array[i];
//	}
//	return copy;
//}
//
