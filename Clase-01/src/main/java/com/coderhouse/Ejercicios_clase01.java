package com.coderhouse;

import java.util.Scanner;

public class Ejercicios_clase01 {

	public static void main(String[] args) {
		
		//Ejercicios sobre Variables y Tipos de Variables
		
		//Ejercicio 01
		int edad = 26;
		System.out.println("-------------------------------------------------");
		System.out.println("Tu edad es: " + edad + " años");
		
		//Ejercicio 02
		final String diasSemana = "Lunes " + "Martes " + "Miercoles " + "Jueves " + "Viernes " + "Sabado " + "Domingo ";
		System.out.println("-------------------------------------------------");
		System.out.println(diasSemana);
		
		//Ejercicio 03
		double precioProducto = 2500;
		System.out.println("-------------------------------------------------");
		System.out.println("El precio es: " + precioProducto);
		
		//Ejercicio 04
		boolean aprobar = false;
		System.out.println("-------------------------------------------------");
		System.out.println("Estado aprobación: " + aprobar);
		
		//EJercicio 05
		char inicialNombre = 'N';
		System.out.println("-------------------------------------------------");
		System.out.println("La inicial del nombre es: " + inicialNombre);
		
		//EJercicio 06
		//Arreglo?
		
		//Ejercicio 07
		String nombreCompleto = "Jose Juan Martinez Perez";
		System.out.println("-------------------------------------------------");
		System.out.println("El nombre completo es: " + nombreCompleto);
		
		//Ejercicio 08
		float peso = 62;
		System.out.println("-------------------------------------------------");
		System.out.println("El peso de la persona es: " + peso);
		
		
		//Ejercicios sobre Constantes

		//Ejercicio 09
		final double valorPi = 3.1416;
		System.out.println("-------------------------------------------------");
		System.out.println("El valor de π es: " + valorPi);
		
		//Ejercicio 10
		final int valorMaximoEstudiantes = 36;
		System.out.println("-------------------------------------------------");
		System.out.println("El valor máximo de estudiantes en el aula es: " + valorMaximoEstudiantes);
		
		//Ejercicios sobre Operadores
		
		//Ejercicio 11
		int sumaNum1 = 250;
		int sumaNum2 = 250;
		System.out.println("-------------------------------------------------");
		System.out.println("La suma es: " + (sumaNum1 + sumaNum2));
		
		//Ejercicio 12
		double restaNum1 = 13.9;
		double restaNum2 = 63.12;
		System.out.println("-------------------------------------------------");
		System.out.println("La resta es: " + (restaNum1 - restaNum2));
		
		//Ejercicio 13
		double multNum1 = 23.5;
		double multNum2 = 12.32;
		System.out.println("-------------------------------------------------");
		System.out.println("La multiplicación es: " + (multNum1 * multNum2));
		
		//Ejercicio 14
		double divNum1 = 50;
		double divNum2 = 5;
		System.out.println("-------------------------------------------------");
		System.out.println("La división es: " + (divNum1 / divNum2));
		
		//Ejercicio 15
		double residuoNum1 = 13;
		double residuoNum2 = 4;
		System.out.println("-------------------------------------------------");
		System.out.println("El residuo de la división es: " + (residuoNum1 % residuoNum2));
		
		//Ejercicios sobre Operadores Relacionales

		
		//Ejercicio 16
		int comparacionNum1 = 10;
		int comparacionNum2 = 5;
		boolean mayorque = comparacionNum1 > comparacionNum2;
		boolean menorque = comparacionNum1 < comparacionNum2;
		System.out.println("-------------------------------------------------");
		System.out.println("Número 1= " + comparacionNum1);
		System.out.println("Número 2= " + comparacionNum2);
		System.out.println("El número 1 es mayor que el segundo? " + mayorque);
		System.out.println("El número 1 es menor que el segundo? " + menorque);
		
		//Ejercicio 17
		System.out.println("-------------------------------------------------");
		
		
	}

}