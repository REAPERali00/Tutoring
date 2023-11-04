#pragma once
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#ifndef STUDENT_H_
#define STUDENT_H_


typedef char* string;

#define STD_VAL_SIZE 5
#define CRS_VAL_SIZE 2
static int std_val[] =  { 12345,11111,22222,33333,44444 };
static string crs_val[] = {"cst8116", "cst8234"};

typedef struct {
	int* studentID; 
	string* courses; 
	int* registration;
}Stud_reg;

static struct Stud_size{
	unsigned int std_size;
	unsigned int crs_size;
}size = { 0 };

enum Message {
	ALOC_FAIL,
	BOUND,
	REG_SUC,
	REG_FAIL,
	DROP_SUC, 
	DROP_FAIL,
};
static string msg[] = {
	"allocation failed.\n",
	"Index out of bounds\n",
	"Student successfully registered!\n", 
	"Failed to register the student\n",
	"Drop course successful\n", 
	"Drop course failed.\n",
};

#define TITLE_SIZE 7
#define WIDTH 20
static string title[] = {
"\t\t\t\t*Registration Table*\n\n",
"Registration Index",
"Student ID",
"Course ID",
"Registration Status\n",
"*************************************************",
"*****************************************\n",
};
 
void failed_mem();
void create_student_id(int* std_id);
void create_student_course(string* course);
void create_default(Stud_reg* std); 
void set_registery(Stud_reg* std, int stdInd, int courseInd, int val); 
void print_title();
void print_registery(Stud_reg* std);
void print_table(Stud_reg* std);
void register_student(Stud_reg* std, int id, string course_id);
void drop_student(Stud_reg* std, int drop_ind);
void free_std(Stud_reg* std);
#endif // !STUDENT_H_

