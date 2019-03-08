# Práctica 2
Esta práctica se trabajará en grupos de 2 hasta 4 personas, cada grupo entregará al final de la clase un repositorio en donde quedará evidenciado el trabajo que han realizado.

## Instrucciones
* El coordinador del grupo deberá realizar **un fork** del repositorio GitContactos ubicado en https://github.com/Esvux/GitContactos
* El coordinador deberá agregar a sus compañeros como colaboradores en su repositorio
* Cada integrante del grupo (incluido el coordinador) deberá clonar el repositorio que ha creado el coordinador
* En el repositorio local cada integrante deberá obtener el código más reciente de las ramas 'master' y 'develop' **git pull**
* Con las ramas listas, apartir de **develop** cada integrante desarrollará la/las características que le sean asignadas siguiendo el flujo de trabajo conocido como gitflow
* Al finalizar el trabajo de programación cada integrante deberá realizar un **merge** de su código sobre la rama **develop** colocando la bandera *--no-ff*, para luego publicar su código en develop (remoto) utilizando **git push**
* Cuando el software esté totalmente funcional (previa aprobación del instructor) el coordinador deberá realizar un **merge** del código resultante de todos sus compañeros (ubicado en **develop**) sobre **master** para luego publicarlo usando **git push**
* Por último, (previa aprobación del instructor) se creará la etiqueta "1.0.0" para dar por concluida la práctica

# Gestión de contactos
Se requiere crear una aplicación de consola para la gestión de contactos. La aplicación mostrará en pantalla un menú con las siguientes opciones:
* crear un nuevo contacto
* eliminar un contacto por su número de teléfono
* mostrar todos los contactos
* filtrar los contactos por nombre

Cada contacto tendrá nombre, apellido, fecha de nacimiento y número de teléfono.

## Nuevo contacto
Esta opción solicitará toda la información para crear un nuevo contacto.

## Eliminar contacto
Esta opción solicitará el número de teléfono de un contacto y procederá a eliminar el contacto asociado con el número de teléfono dado, si no existe ningún contacto con ese número de teléfono se le informará al usuario con un mensaje en pantalla.

## Mostrar todos los contactos
Muestra la información de todos los contactos.

## Filtrar contactos por nombre
Esta opción solicitará al usuario un texto para realizar la búsqueda y luego mostrará la información de los contactos que en el nombre o en los apellidos **contengan** el texto ingresado por el usuario.
