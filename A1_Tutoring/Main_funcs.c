#include "Main_funcs.h"
#include "Student.h"

void start() {
	create_default(&std);
	menu_exe();
}

int menu() {
	int choice = 0; 
	printf("Main Menu:\n"); 
	for (int i = 0; i < MENU_SIZE; i++) {
		printf(menu_print[i], i + 1);
	}
	scanf_s("%d", &choice);
	return choice;
}
void menu_exe() {
	int choice = menu()-1;
	if (choice > MENU_SIZE || choice < 0) {
		printf("Menu out of bounds\n"); 
		return;
	}
	(*exe[choice])();
	menu_exe();
}

void main_reg() {
	register_student(&std, 12345, "cst8116");
	register_student(&std, 11111, "cst8116");

}
void main_drop() {
	drop_student(&std, 2);
}
void main_table() {
	print_table(&std); 
}
void main_exit() {
	printf("Bye!\n"); 
	exit(EXIT_SUCCESS); 
}










