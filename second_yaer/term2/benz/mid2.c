#include "stdio.h"
#include "string.h"

float total = 0, paid = 0;
int arr_collect[5];
int main() {
    printf("============= Khaopun Cafe =============\n");
    printf("Please select item of products:\n");
    printf("[1] Ice cream (45.00฿)\n");
    printf("[2] Snack (35.00฿)\n");
    printf("[3] Bread (30.00฿)\n");
    printf("[4] Soft drink (25.00฿)\n");
    printf("[5] Newspaper (15.00฿)\n");
    printf("[0] Checkout\n");
    printf("========================================\n");

    orderCal();
    printf("Total price: %.2f฿\n", total);
    showPay();
    calShop();

}

void orderCal() {
    int item, quantity;
    float price, amount = 0;
    printf("Enter item of menu: ");
    scanf("%d", &item);

    if (total <= 0) {
        if (item == 0) {
            printf("Please select item of products!\n");
            orderCal();
        }
    }

    if (item == 0) {
        return 0;
    }
    printf("Enter quantity of item: ");
    scanf("%d", &quantity);
    if (item == 1) {
        price = 45;
        arr_collect[0] = quantity;
    }
    else if (item == 2)
    {
        price = 35;
        arr_collect[1] = quantity;
    }
    else if (item == 3)
    {
        price = 30;
        arr_collect[2] = quantity;
    }
    else if (item == 4)
    {
        price = 25;
        arr_collect[3] = quantity;
    }
    else if (item == 5)
    {
        price = 15;
        arr_collect[4] = quantity;
    }

    amount = (price * quantity);
    total = (total + amount);
    orderCal();
}

void showPay() {
    printf("Please pay for your items (more than total price): ");
    scanf("%f", &paid);

    if (paid < total) {
        printf("Please try again!\n");
        printf("%.2f %.2f", total, paid);
        showPay();
    }
    else {
        return 0;
    }
}

void calShop() {
    printf("============= Khaopun Shop =============\n");
    printf("               Receipt\n\n");
    if (arr_collect[0] > 0) {
        printf("%d Ice cream        @45.00        %.2f\n", arr_collect[0], (float)(arr_collect[0] * 45));
    }
    if (arr_collect[1] > 0) {
        printf("%d Snack            @35.00        %.2f\n", arr_collect[1], (float)(arr_collect[0] * 35));
    }
    if (arr_collect[2] > 0) {
        printf("%d Bread            @30.00        %.2f\n", arr_collect[2], (float)(arr_collect[0] * 35));
    }
    if (arr_collect[3] > 0) {
        printf("%d Soft drink       @25.00        %.2f\n", arr_collect[3], (float)(arr_collect[0] * 35));
    }
    if (arr_collect[4] > 0) {
        printf("%d Newspaper        @15.00        %.2f\n", arr_collect[4], (float)(arr_collect[0] * 35));
    }

    printf("Total %d items      %.2f\n", (int)(arr_collect[0]+arr_collect[1]+arr_collect[2]+arr_collect[3]+arr_collect[4]), (float)total);
    printf("Change              %.2f\n", (paid - total));
    printf("========================================");
}
