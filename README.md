# Calculadora Postfix

Hoja de Trabajo #2 – Estructura de Datos

## Autores
- Hector Duarte
- Edgar Guevara 

## Descripción
Este proyecto implementa una **calculadora de expresiones aritméticas en notación Postfix**
utilizando una **pila genérica (Stack)**.  
El programa lee expresiones desde un archivo de texto (`datos.txt`) y muestra el resultado
de cada expresión evaluada.

El diseño sigue el uso de **ADT (Abstract Data Types)** para permitir:
- Cambiar la implementación de la pila sin afectar el programa principal.
- Usar cualquier implementación de la calculadora postfix desarrollada por otros grupos.

---

## Características
- ADT Pila con uso de **genéricos**
- Implementación de la pila usando **Vector dinámico**
- ADT para la **Calculadora Postfix**
- Lectura de expresiones desde archivo de texto
- Manejo de errores:
  - División entre cero
  - Operadores inválidos
  - Expresiones postfix incorrectas
- Diagramas UML (Clases y Secuencia)
- Pruebas unitarias con **JUnit 5**
- Control de versiones con **Git**

---

## Estructura del Proyecto (Maven)

