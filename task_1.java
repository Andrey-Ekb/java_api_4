/**
 * Урок 4. Задание 1.Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном 
 * порядке и каждый из их узлов содержит одну цифру.
 * 1. Необходимо умножьте два числа и верните произведение в виде связанного списка.
 * 2.Необходимо Сложить два числа и верните сумму в виде связанного списка Одно или два числа 
 * могут быть отрицательными.
 * Даны два Deque, цифры в обратном порядке.
 * [3,2,1] - пример Deque
 * [5,4,3]- пример второго Deque
 * 
 * Ответ: 123 * 345 = 42 435
 * Ответ всегда - связный список, в обычном порядке
 * 
 * [4,2,4,3,5] - пример ответа
 */

 import java.util.ArrayDeque;
 import java.util.Arrays;
 import java.util.Deque;
 import java.util.LinkedList;
 import java.util.Scanner;
 
 public class task_1 {
     public static void main(String[] args) {
         Deque<Integer> num1 = new ArrayDeque<>(Arrays.asList(3,2,1,6));
         Deque<Integer> num2 = new ArrayDeque<>(Arrays.asList(5,4,3,4));
 
         StringBuilder sb1=new StringBuilder();
         for (int i=num1.size();i>0;i--) {
             sb1.append(num1.pollLast());
         }
 
         StringBuilder sb2=new StringBuilder();
         for (int i=num2.size();i>0;i--) {
             sb2.append(num2.pollLast());
         }
 
         String numb1 = new StringBuilder(sb1).toString();
         String numb2 = new StringBuilder(sb2).toString();
 
         int number1 = Integer.parseInt(numb1);
         int number2 = Integer.parseInt(numb2);
 
         Scanner scanner = new Scanner(System.in);
 
         System.out.println("Введите команду: 1 - умножение, 2- сложение");
         int key = scanner.nextInt();
         switch (key) {
             case 1:
                 int proiz = number1*number2;
                 System.out.printf("%d * %d = %d\n", number1, number2, proiz);
                 String OutStr=""+proiz;
                 char[]chars=OutStr.toCharArray();
                 LinkedList<Character> OutList=new LinkedList<>();
                 for (int i=0; i<chars.length; i++) {
                     OutList.add(chars[i]);
                 }
                 System.out.println(OutList);
                 break;
             case 2:
                 int add = number1+number2;
                 System.out.printf("%d + %d = %d\n", number1, number2, add);
                 String OutStr1=""+add;
                 char[]charss=OutStr1.toCharArray();
                 LinkedList<Character> OutList1=new LinkedList<>();
                 for (int i=0; i<charss.length; i++) {
                     OutList1.add(charss[i]);
                 }
                 System.out.println(OutList1);
                 break;                
             default:
                 System.out.println("Такой команды нет");
                 break;
         }  
     }
 }
     
 