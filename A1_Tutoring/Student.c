#include "Student.h"
#pragma warning(disable: 4996)

void failed_mem() {
	fprintf(stderr, msg[ALOC_FAIL]);
	exit(EXIT_FAILURE);
}
void create_student_id(int* std_id) {
	for (int i = 0; i < size.std_size; i++) {
		std_id[i] = std_val[i];
	}
}
void create_student_course(string* course) {
	for (int i = 0; i < size.crs_size; i++) {
		course[i] =(string)malloc(strlen(crs_val[i]) + 1);
		if (!course[i]) failed_mem();
		strcpy(course[i], crs_val[i]);
	}
}
void create_default(Stud_reg* std) {
	size.std_size = STD_VAL_SIZE; 
	size.crs_size = CRS_VAL_SIZE;

	std->studentID = (int*) calloc(size.std_size, sizeof(int));
	std->courses = (string*) calloc(size.crs_size, sizeof(string));
	std->registration = (int*)calloc(size.std_size*size.crs_size, sizeof(int)); 
	if (!std->studentID || !std->courses || !std->registration) {
		failed_mem();
	}
	create_student_id(std->studentID);
	create_student_course(std->courses);

}
void set_registery(Stud_reg* std, int stdInd, int courseInd, int val) {
	if (stdInd > size.std_size - 1 || courseInd > size.crs_size - 1) {
		printf(msg[BOUND]); 
		return;
	}
	std->registration[stdInd *  size.crs_size  + courseInd] = val; 
}
void print_title() {
	for (int i = 0; i < TITLE_SIZE; i++) {
		printf("%-*s", WIDTH, title[i]); 
	}
}
void print_table(Stud_reg* std) {
	int w = WIDTH, ind = 0;
	string s = "";
	print_title();
	for (int i = 0; i < size.std_size; i++) {
		for (int j = 0; j < size.crs_size; j++) {
			ind = i * size.crs_size + j;
			s = std->registration[ind] ? " %-*d| %-*d| %-*s| %-*c|\n" : "";
			printf(s, w, ind, w, std->studentID[i], w, std->courses[j], w, 'R');
		}
	}
}
void print_registery(Stud_reg* std) {
	int w = WIDTH, ind = 0;
	print_title();
	for (int i = 0; i < size.std_size; i++) {
		for (int j = 0; j < size.crs_size; j++) {
			ind = i * size.crs_size + j;
			printf(" %-*d| %-*d| %-*s| %-*c|\n", w, ind, w, std->studentID[i], w, std->courses[j], w, std->registration[ind] ? 'R' : 'D');
		}
	}
}
void register_student(Stud_reg* std, int id, string course_id) {
	int ind = 0;
	for (int i = 0; i < size.std_size; i++) {
		for (int j = 0; j < size.crs_size; j++) {
			if (std->studentID[i] == id && strcmp(course_id, std->courses[j]) == 0) {
				ind = i * size.crs_size + j;
				std->registration[ind] = 1; 
				printf(msg[REG_SUC]);
				return;
			}
		}
	}
	printf(msg[REG_FAIL]);
}
void drop_student(Stud_reg* std, int drop_ind) {
	if (drop_ind < 0 || drop_ind >= size.crs_size * size.std_size) {
		printf(msg[BOUND]);
		printf(msg[DROP_FAIL]);
		return;
	}
	std->registration[drop_ind] = 0;
	printf(msg[DROP_SUC]);
}
void free_std(Stud_reg* std) {
	free(std->studentID);
	free(std->courses);
	free(std->registration); 
	free(std);
}
