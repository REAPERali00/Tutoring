#include <stdlib.h>
#include <stdio.h>

#define MAX 100
typedef char* string;
typedef struct {
	string name;
} Student;
int main1() {
	int flag = -4; 
	printf("%s", flag ? "Its true" : "Its fales");
	return EXIT_SUCCESS;
}