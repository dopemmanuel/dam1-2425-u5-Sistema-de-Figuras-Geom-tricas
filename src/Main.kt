package com.dam1.e5j1.src

import com.dam1.e5j1.src.clases.Circulo
import com.dam1.e5j1.src.clases.Rectangulo
import com.dam1.e5j1.src.clases.Triangulo
/**
Ejercicio 1: Sistema de Figuras Geométricas
Crea una clase abstracta Figura que tenga métodos abstractos para area() y perimetro().
Implementa subclases concretas como Circulo, Rectangulo, y Triangulo, proporcionando la implementación específica de estos métodos.
La clase Figura podría tener propiedades comunes como el color, que se inicializarán a través del constructor.

El valor de PI lo conseguimos con Math.PI.

Objetivos:
Practicar la creación de clases abstractas y métodos abstractos.
Entender cómo las subclases proporcionan implementaciones concretas de métodos abstractos.
Familiarizarse con los conceptos básicos de geometría y cómo se pueden aplicar en la programación orientada a objetos.
**/

fun main(){
    val circulo = Circulo("Rojo", 5.0)
    println("Círculo - Color: ${circulo.color}, Área: ${circulo.area()}, Perímetro: ${circulo.perimetro()}")

    val rectangulo = Rectangulo("Azul", 4.0, 6.0)
    println("Rectángulo - Color: ${rectangulo.color}, Área: ${rectangulo.area()}, Perímetro: ${rectangulo.perimetro()}")

    val triangulo = Triangulo("Verde", 3.0, 4.0, 3.0, 4.0, 5.0)
    println("Triángulo - Color: ${triangulo.color}, Área: ${triangulo.area()}, Perímetro: ${triangulo.perimetro()}")
}