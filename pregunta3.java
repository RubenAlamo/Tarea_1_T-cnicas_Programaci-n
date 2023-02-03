//¿Has hecho alguna vez un algoritmo para un programa? ¿Qué hacia? ¿Era correcto y eficiente?

//generame un array de 10 numeros y que me muestre el promedio de los numeros ingresados
     import java.util.Scanner;
        public class pregunta3 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, promedio;
                System.out.println("Ingrese el primer numero");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = sc.nextInt();
                System.out.println("Ingrese el tercer numero");
                num3 = sc.nextInt();
                System.out.println("Ingrese el cuarto numero");
                num4 = sc.nextInt();
                System.out.println("Ingrese el quinto numero");
                num5 = sc.nextInt();
                System.out.println("Ingrese el sexto numero");
                num6 = sc.nextInt();
                System.out.println("Ingrese el septimo numero");
                num7 = sc.nextInt();
                System.out.println("Ingrese el octavo numero");
                num8 = sc.nextInt();
                System.out.println("Ingrese el noveno numero");
                num9 = sc.nextInt();
                System.out.println("Ingrese el decimo numero");
                num10 = sc.nextInt();
                promedio = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;
                System.out.println("El promedio de los numeros ingresados es: " + promedio);
                sc.close();
            }
        }
