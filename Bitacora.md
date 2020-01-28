#Bitacora de cambios
- Creado Clase abstracta Duck y dos clases de patos
- Aniadido RobberDucky, y metodo quak sobre escrito
- Aniadido DecoyDock, el metodo quak y fly reescrito
- Se refactorizaron las clases y se crearon Iterfaces Flyable and Quackable (SRP, DIP)



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
   
  
    