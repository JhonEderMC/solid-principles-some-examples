## Principio de Responsabilidad Única (SRP):

Crea una clase abstracta llamada Forma con un método abstracto calcularArea().
Crea dos clases, Circulo y Rectangulo, que hereden de Forma y proporcionen implementaciones concretas para el cálculo del área.

## Principio de Abierto/Cerrado (OCP):

Define una interfaz llamada Descuento con un método aplicarDescuento(double precio).
Crea dos clases que implementen la interfaz Descuento, DescuentoPorcentaje y DescuentoMontoFijo, con implementaciones concretas de cálculos de descuento.

## Principio de Sustitución de Liskov (LSP):

Crea una clase llamada CalculadoraArea con un método calcularAreaTotal(Forma[] formas) que calcule el área total de varias formas.
Asegúrate de que las clases Círculo y Rectángulo sean intercambiables en el método calcularAreaTotal().


