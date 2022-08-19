#include "stdio.h"
#include "string.h"

int main()
{
    char chooseRe;
    int chooseMenu, quantity, total = 0, case1 = 0, newQuantity, case2 = 0, case3 = 0, case4 = 0, case5 = 0, qu1 = 0, qu2 = 0, qu3 = 0, qu4 = 0, qu5 = 0;
    float total1, total2, total3, total4, total5;
    float totalAll = 0, pay = 0;
    printf("============= Khaopun Shop =============\n");
    printf("Please select item of products:\n");
    printf("[1] Ice cream (45.00฿)\n");
    printf("[2] Snack (35.00฿)\n");
    printf("[3] Bread (30.00฿)\n");
    printf("[4] Soft drink (25.00฿)\n");
    printf("[5] Newspaper (15.00฿)\n");
    printf("[0] Checkout\n");
    printf("========================================\n");

    while (0 == 0)
    {
        printf("Enter item: ");
        scanf("%d", &chooseMenu);
        printf("%d", chooseMenu);
        printf("%d", total);
        if (chooseMenu == 0 && total == 0)
        {
            printf("Please Select item of produts!\n");
            continue;
        }
        else if (chooseMenu != 0)
        {
            switch (chooseMenu)
            {
            case 1:
                if (case1 != 0)
                {
                    printf("Do you want to replace the order? \n");
                    scanf("%c", &chooseRe);
                    if (chooseRe == 'Y')
                    {
                        printf("Enter quantity of items: ");
                        scanf("%d", &newQuantity);
                        total1 += (45.00 * (qu1 - newQuantity));
                        total += total1;
                    }
                    else
                    {
                        continue;
                    }
                }
                else
                {
                    printf("Enter quantity of items: ");
                    scanf("%d", &quantity);
                    qu1 = quantity;
                    total1 += 45.00 * quantity;
                    total += total1;
                    case1++;
                    printf("%d\n", case1);
                }
                break;
            }
        }
        else if (chooseMenu == 0)
        {
            break;
        }

        // totalAll = total1 + total2 + total3 + total4 + total5;
        // printf("Total price %.2f฿", totalAll);
        // do
        // {
        //     printf("Please pay for your items(more than total price): \n");
        //     scanf("%f", &pay);
        // } while (totalAll > pay);
        // printf("============= Khaopun Shop =============\n");
        // printf("                 Receipt\n");
        // printf("\n");
        // if (case1 != 0)
        // {
        //     printf("1 Ice cream @45.00   %.2f\n", total1);
        // }
        // if (case2 != 0)
        // {
        //     printf("2 Snack @35.00   %.2f\n", total2);
        // }
        // if (case3 != 0)
        // {
        //     printf("3 Bread @30.00   %.2f\n", total3);
        // }
        // if (case4 != 0)
        // {
        //     printf("4 Soft drink @25.00   %.2f\n", total4);
        // }
        // if (case5 != 0)
        // {
        //     printf("5 Newspaper @15.00   %.2f\n", total5);
        // }
        // printf("Total %d items  %2.f\n", qu1 + qu2 + qu3 + qu4 + qu5, totalAll);
        // printf("Change %2.f\n", pay - totalAll);
        // printf("========================================\n");
        // return 0;
    }