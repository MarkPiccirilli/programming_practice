//subscript integer with pointer
//
//

#include<stdio.h>
#include<stdlib.h>

int main() {
	int i = 7;
	int p = 0;

	printf("out: %d\n",i[&p]);
}
