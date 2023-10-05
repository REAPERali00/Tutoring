#include <stdlib.h>
#include <stdio.h>

typedef struct {
	int size;
	int* array;
}Array;
 
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

void reverseArr(Array* arr) {
	int temp = 0;
	for (int i = 0; i < arr->size/2; i++) {
		temp = arr->array[i]; 
		arr->array[i] = arr->array[arr->size - i - 1];
		arr->array[arr->size - i - 1] = temp; 
	}
}

int main() {
	Array arr; 
	createArr(&arr);
	printArr(&arr);
	reverseArr(&arr); 
	printArr(&arr);
	return EXIT_SUCCESS;

}
