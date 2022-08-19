#include <stdio.h>
#include <math.h>
int main() {
    double price, num_d, height, volume, bml;
    scanf("%lf %lf %lf", &price, &num_d, &height);
    volume = height*M_PI*pow(num_d/2, 2);
    bml = price/volume;
    printf("Volume : %.2lfml\nBaht/ml : %.4lf", volume, bml);
}