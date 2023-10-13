//#include <stdlib.h>
//#include <stdio.h>
//
//typedef char* cp;
//typedef cp* cpp;
//
//void printArr(int* arr, int size) { //arr[0] address is 1, the address of arr[1]  would be 2
//	for (int i = 0; i < size; i++) {
//		printf("%d ", *(arr + i));//arr = address of arr[0], arr + 1 would hold address of arr[1]
//	}
//
//	//printf("%d ", *arr);
//}
//
//void printArr2(int* arr, int size) {
//	for (int i = 0; i < size; i++, arr++) {
//		printf("%d ", *arr);
//	}
//	printf("%d ", *arr);
//
//}
//
//void addOne(int* m) {
//	*m += 1;
//}
//
//int main1() {
//	char n = 65;//1
//	cp smt = &n; //smt = 1A
//	char m = 97;//2B
//	cp smt2 = &m;// smt2 = 1A ie I am pointing to n
//	cpp pp = &smt;//pp = address of smt. whats in smt? 1A
//	smt2 = *pp;
//	addOne(&n);
//	printf("%c %c\n", **pp, *smt2);
//	int* arr[3];
//	arr[0] = (int[]){1,23, 2};
//	arr[1] = (int[]){ 1,2,3,4 };	//	int size = sizeof(arr) / sizeof(arr[0]);
//
//	/*printArr(arr[0], 3);
//	printArr(arr[1], 4);*/
//
//
//	return EXIT_SUCCESS;
//}