Creamos una carpeta: exam-java fuera de la carpeta utilizada durante el curso
Añadimos un fichero readme.md con un título
Agregamos un fichero .gitignore para Java-Maven
Creamos un repositorio de git
Añadimos un commit de mensaje: "Compromiso inicial"
Lo vinculamos con nuestro github en el repo: "exam-java"
Añadimos un nuevo proyecto Arquetipo JAV-Maven: QuickStart:
ID de grupo: "com.cdsb"
nombre: "examen"
Añadimos un nuevo commit: "Agregar proyecto"
Lo subimos a GitHub


Gestión de Zoológico: requisitos
Los requisitos que nos llegan del cliente son los siguientes:

Tengo un zoológico y quiero un sistema que me ayude a gestionarlo

Voy a gestionar una combinación de

mamíferos (mamíferos) (como leones (leones), elefantes (elefantes) o cebras (zebras))
aves (pájaros) (loros (loros), tucanes (tucanes))
reptiles (reptiles) (serpientes (serpientes), iguanas (iguanas))
animales acuáticos (animales acuáticos) (delfines (delfines), focas (focas))

Algunos animales (animals) pueden convivir en grupos, y otros deben mantenerse solos.

Cada especie tiene sus propios requisitos.

de espacio (tamaño del hábitat que necesitan)
de alimentación (tipo de dieta, frecuencia)
cuidados veterinarios específicos
Hay animales que son compatibles (pueden compartir el mismo hábitat (habitat)) y otros que no. De otros, no sabemos.

La compatibilidad entre animales (animals) depende de

su comportamiento natural (depredador/presa)
del tipo de hábitat que necesitan
Suelen ser fácilmente combinables animales de comportamiento y hábitat similares (herbívoros como elefantes (elefantes) con cebras (cebras), aves tropicales como loros (loros) con tucanes (tucanes), o animales acuáticos sociales como delfines (delfines) con focas (focas)), pero no depredadores con presas (león (lion) con elefante (elefante) o cebra (zebra)), ni reptiles territoriales que prefieren estar solos (serpientes (snakes) e iguanas (iguanas) deben mantenerse separados)

En el zoológico, tengo disponibles varios tipos de hábitats (habitats), de distintos tamaños (terrestre (terrestrial), acuático (aquatic), terrario (terrarium)).

Se trata de hacer un programa en Java que permita gestionar el zoológico, de acuerdo con las indicaciones dadas por el cliente.


Extracción de conceptos Zoologico 

Nombres: mammals            feeding           Verbos: assign/asignar       valores: lions           dolphins/delfines
         compatibility      habitat                   verify                        elephants       seals/focas
         birds              terrestrial               show/mostrar                  zebras
         reptiles           terrarium                 assess/evaluar                parrots/loros
         aquatics                                     remove/eliminar               toucans/tucanes
         animals                                                                    snakes/serpientes
         space                                                                      iguanas

Package: ZOO
Class Abstract: Animals      Subclass: Mammals     Interfaz: 
                                       Birds
                                       Reptiles
                                       Aquatics

enums: Typeanimal
       Habitattype
       Conduct

