#pragma once
#ifndef MAIN_H_
#define MAIN_H_
#include <stdio.h>
#include <stdlib.h>
#include "Student.h"


static Stud_reg std;

#define MENU_SIZE 4	
enum menu_options {
	REIGSTER = 1, 
	DROP, 
	DISPLAY, 
	EXIT
};
//Include the keyword static for variables made in .h file. 
static string menu_print[] = {
	" [%d] Register a student into a course.\n",
	" [%d] Drop a student from a course.\n",
	" [%d] Display Registration table.\n",
	" [%d] Exit.\n",
	" Enter an option from the menu: "
	" Sorry, this option is not available yet\n"
};

void start();
void test();
int menu();
void menu_exe();

void main_reg();
void main_drop();
void main_table();
void main_exit();

typedef void (*PTR_FUNC)();
static PTR_FUNC exe[] = {
	main_reg, 
	main_drop,
	main_table,
	main_exit,
};



#endif // !MAIN_H_
