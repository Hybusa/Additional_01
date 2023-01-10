public class Main
{
    public static void main(String[] args)

    {
        //First tast
//          У вас есть две переменных, в которых хранятся два целочисленных числа.
//          Напишите программу, которая выводит в консоль результат деления первого числа на второе с остатком.
//          В качестве исходных данных используйте значения для первого числа *– 47, для второго – 13):*
//          В результате деления 47 */ 13*
//          Выходит *3 и 6 в остатке*

        int a1 = 47;
        int b1 = 13;

        int div_main = a1 / b1;

        int div_add = a1 % b1;

        System.out.println("Задание 1:");
        System.out.println(a1 + " / " + b1 + " = " + div_main + " и " + div_add + " в остатке.");
        System.out.print(System.lineSeparator());

        //Second task
//        Напишите программу, которая вычисляет сумму цифр двухзначного числа.
//        Программа должна работать с любым значением числа. В качестве исходных данных используйте число 44.

        int a2  = 44;

        int h_div2 = a2/10;
        int w_div2 = a2 % 10;

        int sum2 = h_div2 + w_div2;

        System.out.println("Задание 2:");
        System.out.println(sum2);
        System.out.print(System.lineSeparator());

        //Third task

//        Напишите программу, которая вычисляет сумму цифр трехзначного числа.
//        Программа должна работать с любым значением числа. В качестве исходных данных используйте число 345.

        int a3  = 44;

        int d_div3 = a3/10;
        int h_div3 = a3/10;
        int w_div3 = a3 % 10;

        int sum3 = d_div3 + h_div3 + w_div3;

        System.out.println("Задание 3:");
        System.out.println(sum3);
        System.out.print(System.lineSeparator());

        //Fourth task
/*
        Коля пришел в цветочный магазин и решил купить букет цветов своей подруге.
        Букет стоит ромашек 4899 рублей. К цветам он купил открытку, которая стоит 157 рублей.
        При покупке Коле дали скидку в 10% на сумму двух покупок.
        Вычислите и выведите в консоль сумму двух покупок с учетом скидки.
        Отдельно выведите сумму скидки двух покупок.
*/

        int a4_f = 4899;
        int b4_c = 157;
        int disc4 = 10;

        double disc_sum4 = (a4_f + b4_c)*disc4/100f;
        double disc_sum4_r = Math.round(disc_sum4*100.0)/100.0;

        double sum4 = (a4_f + b4_c) - disc_sum4_r;
        double sum4_r = Math.round(sum4*100.0)/100.0;

        System.out.println("Задание 4:");
        System.out.println("Сумма покупки со скидкой: " + sum4_r + "р");
        System.out.println("Скидка: " + disc_sum4_r + "р");
        System.out.print(System.lineSeparator());


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
        int a5_a = 73;
        int a5_a_disc = 15;
        int a5_a_amount = 10;

        int a5_b = 95;
        int a5_b_amount = 2;

        double a5_sum = (a5_a*a5_a_amount) - ((a5_a*a5_a_amount)*a5_a_disc/100f) + a5_b*a5_b_amount;

        double a5_sum_r = Math.round(a5_sum*100.0)/100.0;

        System.out.println("Сумма покупки A со скидкой: " + a5_sum_r + "р");

        // Часть Б
        int b5_s = 2870;
        int b5_s_disc = 50;
        int b5_s_amount = 7;

        int b5_b = 27;
        int b5_b_amount = 1;

        double a5_s_sum = (b5_s*b5_s_amount) - (b5_s*b5_s_amount)*b5_s_disc/100f;
        double a5_s_sum_r = Math.round(a5_s_sum*100.0)/100.0;

        double b5_b_sum = b5_b*b5_b_amount;

        double b5_sum_r = a5_s_sum_r + b5_b_sum;

        System.out.println("Сумма покупки Б со скидкой: " + b5_sum_r + "р");

        // Часть В

        int c5_sm = 436;
        double c5_sm_amount =  2.5;

        int c5_wm = 578;
        double c5_wm_amount = 3.75;

        int c5_m_disc = 5;

        double c5_m_sum = (c5_sm*c5_sm_amount) + (c5_wm*c5_wm_amount) - (c5_sm*c5_sm_amount)*c5_m_disc/100f;
        double c5_m_sum_r = Math.round(c5_m_sum*100.0)/100.0;

        System.out.println("Сумма покупки В со скидкой: " + c5_m_sum_r + "р");

        //Sixth task

/*
        Объявите 2 переменных типа double ****со значениями
        x = 0.40,
        y = 0.87;
        Посчитайте следующие выражения и выведите результат программы в консоль после каждого подсчета:
        11*x + y
        (x+10*y)- 15*(x/y);
*/

        double x = 0.40;
        double y = 0.87;

        System.out.println("11*x + y =  " + ((11*x)+y));
        System.out.println("(x+10*y) - 15*(x/y) =  " + ((x+10+y) - (15*(x/y))));



        System.out.println("Конец первого блока '1.2 Переменные' ");

    }


}