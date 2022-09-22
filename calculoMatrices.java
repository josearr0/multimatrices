    
package tercersemestre;

import java.util.Scanner;

public class calculoMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a[][]= new int[3][2];
        int b[][]= new int[2][3];
        int matrizResultado[][] = new int[3][3];


            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print("Valor de la matriz 1 en la posicion ["+i+"]["+j+"]: ");
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.print("\n"+"----------------------"+"\n"+"\n");
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    System.out.print("Valor de la matriz 2 en la posicion ["+i+"]["+j+"]: ");
                    b[i][j] = sc.nextInt();
                }
            }

            System.out.println("----------------------"+"\n" + "Primera matriz: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("----------------------");
            System.out.println("Segunda matriz:");
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println("");
            }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        // aquí se multiplica la matriz
                        matrizResultado[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("----------------------" + "\n");
            System.out.println("Matriz resultado: ");
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado[0].length; j++) {
                    System.out.print(matrizResultado[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("\n");
        }
    }

