#Bitacora de cambios
- Creado Clase abstracta Duck y dos clases de patos
- Aniadido RobberDucky, y metodo quak sobre escrito
- Aniadido DecoyDock, el metodo quak y fly reescrito
- Se refactorizaron las clases y se crearon Iterfaces Flyable and Quackable (SRP, DIP)
- Se han creado interfaces y clases contretas para el comportamiento de Fly y Quack
- Se ha refactorizado las clases de los Patos y la clase padre Duck, con las nuevas interzaces
- Se ha creado el nuevo tipo de Pato ModeDuck y se han creado los metodos set en la clase Duck


#Respuestas a las preguntas del documentos
- Which of the following are disadvantages of using inheritance to
  provide Duck behavior?
  - A. Code is duplicated across subclasses
  - D. Hard to gain knowledge of all duck behaviors.
  - F. Changes can unintentionally affect other ducks.
  
- What do YOU think about this design?
    - me parece que hay codigo repetido en los metodos fly() y quack()
    
- Razones por las que ha ido cambiando mis aplicaciones
    - Los clientes no tienen en claro lo que necesitan, asi que añaden funcionalidad
    - En sistemas contables, generalmente cambian las formulas de una empresa a otra para los reportes de sus estados financieros
    - Generalmente simpre aumentan o cambian los usuarios y roles del sistema
 
- Using our new design, what would you do if you needed to
  add rocket-powered flying to the SimUDuck app?
    - Se crearia una nueva clase `SimUDuck` que implemente la interfaz `FlyBehavior`
- Can you think of a class that might want to use the Quack behavior that isn’t a duck?
    - un pato de juguete o algo que haga sonidos de patos
  
    