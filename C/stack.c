#include <stdio.h>
#define MAX 5 // size of the stack

int st[MAX], top = -1;

void push(int st[]) // it insert the elements in stack
{
    if (top == MAX - 1)
    {
        printf("Stack is full\n");
    }
    printf("enter the value you want to insert & enter -1 to stop\n");
    int val = 0;

    while (val != -1)
    {
        scanf("%d", &val);
        if (val != -1)
        {
            top++;
            st[top] = val;
        }
    }
}

void display(int st[])
{
    if (top == -1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("Stack is not empty\n");
        for (int i = top; i >= 0; i--)
        {
            printf("%d\n", st[i]);
        }
    }
}

int peek(int st[], int top)
{
    if (top == -1)
    {
        printf("Stack is empty\n");
        return -1;
    }
    else
    {
        printf("Top element is %d\n", st[top]);
        return top;
    }
}

int delete (int st[], int top)
{
    if (top == -1)
    {
        printf("Stack is empty\n");
        return -1;
    }
    else
    {
        printf("element deleted %d\n", st[top]);
        top--;
        return top;
    }
}
int main(int argc, char const *argv[])
{

    int option;
    printf("enter the option\n1.enter the element\n2.display\n3.peek\n4.delete\n");
    scanf("%d", &option);
    do
    {
        switch (option)
        {
        case 1:
            push(st);
            break;
        case 2:
            display(st);
            break;
        case 3:
            peek(st, top);
            break;
        case 4:
            delete (st, top);
            break;
        case 5:
            break;
        }
        printf("enter the option\n1.enter the element\n2.display\n3.peek\n4.delete\n5.exit\n");
        scanf("%d", &option);
    } while (option != 5);
    return 0;
}
