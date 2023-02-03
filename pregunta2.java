//¿Que algoritmos crees que usan por tus juegos y aplicaciones favoritas?

//generame numeros primos del 1 al 100
    import java.util.Scanner;
    public class pregunta2 {
        Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
             int num1, num2, num3, num4, num5, promedio;

                System.out.println("Ingrese el primer numero");
                num1 = teclado.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = teclado.nextInt();
                System.out.println("Ingrese el tercer numero");
                num3 = teclado.nextInt();
                System.out.println("Ingrese el cuarto numero");
                num4 = teclado.nextInt();
                System.out.println("Ingrese el quinto numero");
                num5 = teclado.nextInt();
                promedio = (num1 + num2 + num3 + num4 + num5) / 5;
                System.out.println("El promedio de los numeros ingresados es: " + promedio);
                teclado.close();
            }
        }



