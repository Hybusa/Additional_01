public class Main
{
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();


    }




    public static void task1 ()
    {
        //First task
//          У вас есть две переменных, в которых хранятся два целочисленных числа.
//          Напишите программу, которая выводит в консоль результат деления первого числа на второе с остатком.
//          В качестве исходных данных используйте значения для первого числа *– 47, для второго – 13):*
//          В результате деления 47 */ 13*
//          Выходит *3 и 6 в остатке*

        int a = 47;
        int b = 13;

        int div_main = a / b;

        int div_add = a % b;

        System.out.println("Задание 1:");
        System.out.println(a + " / " + b + " = " + div_main + " и " + div_add + " в остатке.");
        System.out.print(System.lineSeparator());

    }

    public static void task2() {
        //Second task
//        Напишите программу, которая вычисляет сумму цифр двухзначного числа.
//        Программа должна работать с любым значением числа. В качестве исходных данных используйте число 44.

        int a  = 44;

        int h_div = a/10;
        int w_div = a % 10;

        int sum = h_div + w_div;

        System.out.println("Задание 2:");
        System.out.println(sum);
        System.out.print(System.lineSeparator());

    }

    public static void task3() {

        //Third task

//        Напишите программу, которая вычисляет сумму цифр трехзначного числа.
//        Программа должна работать с любым значением числа. В качестве исходных данных используйте число 345.

        int a  = 345;

        int d_div = a/100;
        int h_div = (a/10)%10;
        int w_div = a % 10;

        int sum = d_div + h_div + w_div;

        System.out.println("Задание 3:");
        System.out.println(sum);
        System.out.print(System.lineSeparator());

    }

    public static void task4() {

        //Fourth task
/*
        Коля пришел в цветочный магазин и решил купить букет цветов своей подруге.
        Букет стоит ромашек 4899 рублей. К цветам он купил открытку, которая стоит 157 рублей.
        При покупке Коле дали скидку в 10% на сумму двух покупок.
        Вычислите и выведите в консоль сумму двух покупок с учетом скидки.
        Отдельно выведите сумму скидки двух покупок.
*/

        int a_f = 4899;
        int b_c = 157;
        int disc = 10;

        double disc_sum = (a_f + b_c)*disc/100f;
        double disc_sum_r = Math.round(disc_sum*100.0)/100.0;

        double sum = (a_f + b_c) - disc_sum_r;
        double sum_r = Math.round(sum*100.0)/100.0;

        System.out.println("Задание 4:");
        System.out.println("Сумма покупки со скидкой: " + sum_r + "р");
        System.out.println("Скидка: " + disc_sum_r + "р");
        System.out.print(System.lineSeparator());


    }

    public static void task5() {
        //Fifth task

/*
        Сделайте расчет товаров со скидками.
        а) Апельсины стоят 73 руб/кг и на них действует скидка 15%, а товар бананы стоят 95 руб/кг.
        Клиент взял 10 кг апельсинов и 2кг бананов.
        Вычислите и выведите в консоль сумму  покупки с учетом скидки.
        б) Шампанское стоит 2870 руб и на него действует скидка 50%, а товар хлеб стоит 27 руб.
        Клиент взял 7 бутылок шампанского и 1 батон хлеба.
        Вычислите и выведите в консоль сумму покупки с учетом скидки.
        в) Шампиньоны стоят 436 руб/кг, а белые грибы стоят 578 руб/кг и на них действует скидка 5%.
        Клиент взял 2,5 кг шампиньонов и 3,75 кг белых грибов.
        Вычислите и выведите в консоль сумму покупки с учетом скидки.
*/

        System.out.println("Задание 5:");
        // Часть А
        int a_a = 73;
        int a_a_disc = 15;
        int a_a_amount = 10;

        int a_b = 95;
        int a_b_amount = 2;

        double a_sum = (a_a*a_a_amount) - ((a_a*a_a_amount)*a_a_disc/100f) + a_b*a_b_amount;

        double a_sum_r = Math.round(a_sum*100.0)/100.0;

        System.out.println("Сумма покупки A со скидкой: " + a_sum_r + "р");
        System.out.print(System.lineSeparator());

        // Часть Б
        int b_s = 2870;
        int b_s_disc = 50;
        int b_s_amount = 7;

        int b_b = 27;
        int b_b_amount = 1;

        double a_s_sum = (b_s*b_s_amount) - (b_s*b_s_amount)*b_s_disc/100f;
        double a_s_sum_r = Math.round(a_s_sum*100.0)/100.0;

        double b_b_sum = b_b*b_b_amount;

        double b_sum_r = a_s_sum_r + b_b_sum;

        System.out.println("Сумма покупки Б со скидкой: " + b_sum_r + "р");
        System.out.print(System.lineSeparator());

        // Часть В

        int c_sm = 436;
        double c_sm_amount =  2.5;

        int c_wm = 578;
        double c_wm_amount = 3.75;

        int c_m_disc = 5;

        double c_m_sum = (c_sm*c_sm_amount) + (c_wm*c_wm_amount) - (c_sm*c_sm_amount)*c_m_disc/100f;
        double c_m_sum_r = Math.round(c_m_sum*100.0)/100.0;

        System.out.println("Сумма покупки В со скидкой: " + c_m_sum_r + "р");
        System.out.print(System.lineSeparator());


    }

    public static void task6() {

        //Sixth task

/*
        Объявите 2 переменных типа double ****со значениями
        x = 0.40,
        y = 0.87;
        Посчитайте следующие выражения и выведите результат программы в консоль после каждого подсчета:
        11*x + y
        (x+10*y)- 15*(x/y);
*/
        System.out.println("Задание 6:");

        double x = 0.40;
        double y = 0.87;

        System.out.println("11*x + y =  " + ((11*x)+y));
        System.out.println("(x+10*y) - 15*(x/y) =  " + ((x+10+y) - (15*(x/y))));


        System.out.print(System.lineSeparator());
        System.out.println("Конец первого блока '1.2 Переменные' ");

    }
    
}