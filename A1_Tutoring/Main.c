#pragma once

#include <stdio.h>
#include <stdlib.h>
#include "Student.h"
#define _CRT_SECURE_NO_WARNINGS

int main() {
	Stud_reg std; 
	int width = 10; 
	string s = "hello"; 
	printf("%-*s %-*s\n", width, s, width, s);
	print_title();
	create_default(&std);

	return EXIT_SUCCESS; 
}
