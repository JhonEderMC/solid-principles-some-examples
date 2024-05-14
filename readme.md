## Principio de Responsabilidad Única (SRP):

Principio de Responsabilidad Única (Single Responsibility Principle): Este principio establece que una clase debe tener una única razón 
para cambiar. En otras palabras, una clase debe tener una única responsabilidad. Esto facilita el mantenimiento y evita que los cambios en 
una parte del código afecten a otras partes de manera inesperada.

Crea una clase abstracta llamada Forma con un método abstracto calcularArea().
Crea dos clases, Circulo y Rectangulo, que hereden de Forma y proporcionen implementaciones concretas para el cálculo del área.

## Principio de Abierto/Cerrado (OCP):

Principio de Abierto/Cerrado (Open/Closed Principle): Según este principio, las entidades de software (como clases, módulos, etc.) 
deben estar abiertas para la extensión pero cerradas para la modificación. Esto significa que se deben poder agregar nuevas funcionalidades 
o comportamientos sin cambiar el código existente.

Define una interfaz llamada Descuento con un método aplicarDescuento(double precio).
Crea dos clases que implementen la interfaz Descuento, DescuentoPorcentaje y DescuentoMontoFijo, con implementaciones concretas de cálculos de descuento.

## Principio de Sustitución de Liskov (LSP):

Principio de Sustitución de Liskov (Liskov Substitution Principle): Este principio establece que los objetos de una clase 
derivada deben poder sustituirse por objetos de la clase base sin afectar la corrección del programa. En otras palabras, 
las clases derivadas deben ser compatibles con las clases base en términos de comportamiento.

Crea una clase llamada CalculadoraArea con un método calcularAreaTotal(Forma[] formas) que calcule el área total de varias formas.
Asegúrate de que las clases Círculo y Rectángulo sean intercambiables en el método calcularAreaTotal().

## Principio de Segregación de Interfaces (ISP):

Principio de Segregación de Interfaces (Interface Segregation Principle): Este principio sugiere que una clase no debería 
verse forzada a implementar interfaces que no utiliza. En lugar de eso, las interfaces deben estar diseñadas para ser específicas 
y contener solo los métodos requeridos por las clases que las implementan.

Crea dos interfaces, Encendible con métodos encender() y apagar(), y Ajustable con un método ajustarVolumen().
Implementa las interfaces en las clases Televisión y Radio de acuerdo con sus funcionalidades.

## Principio de Inversión de Dependencia (DIP):

Principio de Inversión de Dependencia (Dependency Inversion Principle): El último principio establece que los módulos de 
alto nivel no deben depender directamente de módulos de bajo nivel. Ambos deben depender de abstracciones. Además, 
las abstracciones no deben depender de los detalles, sino que los detalles deben depender de las abstracciones.

Define una interfaz ServicioNotificación con un método enviar(String mensaje).
Crea clases concretas que implementen esta interfaz, como ServicioEmail y ServicioSMS, con lógica de envío de notificaciones.
Crea una clase Notificador que tenga una dependencia de ServicioNotificación y un método enviarNotificacion(String mensaje) que utilice el servicio.


