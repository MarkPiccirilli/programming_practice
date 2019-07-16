#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void main(int argc, char* argv[]) {

	if(argc < 2) {
		printf("Argument not included\n");
		exit(1);
	}

	long k = (long)atoi(argv[1]);
	long i, j=k;
	clock_t start = clock();
	for(i=0; i <= 1000000000; i++) {
		j++;
		if(j % 2000000 == 0) {
			printf("%ld\n", j);
		}
	}
	clock_t end = clock();

	int time = (end - start) * 1000 / CLOCKS_PER_SEC;
	
	printf("Time to count to 1 billion: %d\n", time);
}
