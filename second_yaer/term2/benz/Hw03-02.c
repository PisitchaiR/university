#include "stdio.h"
#include "math.h"

int main() {
    float height, weight, result;

    scanf("%f %f", &height, &weight);
    height = pow((height/100), 2);
    result = weight/height;
    printf("%f", result);
}