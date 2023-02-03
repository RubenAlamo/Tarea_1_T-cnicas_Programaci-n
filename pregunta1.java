//¿Que algoritmos usas en tu vida cotidiana? ¿Piensas que podrias escribir un programa para hacerlos mas eficientes?

//generame un programa que me permita ingresar 5 numeros y me muestre el promedio de los numeros ingresados
import java.util.Scanner;
public class pregunta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4, num5, promedio;
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
        promedio = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("El promedio de los numeros ingresados es: " + promedio);
        sc.close();
    }
}

