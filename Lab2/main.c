#include <stdlib.h>
#include <stdio.h>
#include <time.h>

#ifndef LAB2_H_
#include "Lab2.h"
#endif // !LAB2_H_

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


