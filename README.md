Este proyecto es una automatización de pruebas de interfaz de usuario utilizando el framework de **Serenity BDD** con el patrón de diseño **Screenplay** y la herramienta **Cucumber**; las siguientes son las historias de usuarios automatizadas:

## Historia de usuario #1  Inicio de sesión 

### Descripción: 
**Como** administrador **quiero** poder diligenciar mis credenciales en la página de inicio de sesión **para** proceder a ingresar a la página principal de orangehrmlive. 

### Criterios de aceptación: 
- El administrador debe poder ingresar correctamente su nombre de usuario en la entrada de nombre de usuario. 
- El administrador debe poder ingresar correctamente su contraseña en la entrada de contraseña.
- Cuando el administrador haga clic en el botón de “Acceso” se debe direccionar a la página principal de orangehrmlive. 


## Historia de usuario #1  Inicio de sesión
### Descripción:
**Como** administrador, **quiero** poder ingresar mis credenciales en la página de inicio de sesión **para** acceder a la plataforma OrangeHRM.

### Criterios de aceptación:
**Ingreso de credenciales:** Podré ingresar correctamente mi nombre de usuario y contraseña en los campos correspondientes.
**Acceso a la plataforma:** Al hacer clic en el botón "Acceder", seré redireccionado a la página principal de OrangeHRM.
**Validación de acceso:** Podré validar que se visualiza la seccion de panel principal.

## Historia de usuario #2: Proceso de reclutamiento

**Como** administrador, **quiero** registrar el proceso de contratación de un nuevo aspirante **para** poder validar si es contratado exitosamente en la plataforma OrangeHRM.

**Precondición:** Sesión iniciada correctamente.

Criterios de aceptación:
**Agregar candidato:** Al hacer clic en "Reclutamiento" y luego en "Agregar", podré completar todos los campos del formulario correspondiente. Al finalizar, el estado del candidato debe cambiar a "Solicitud iniciada".

**Preseleccionar candidato:** Podré iniciar el proceso de preselección, incluyendo una nota si lo considero necesario. Una vez completado este paso, el estado del candidato deberá ser "Preseleccionado".

**Programar entrevista:** Podré programar una entrevista, llenando todos los datos requeridos en la sección correspondiente. Al finalizar, el estado del candidato cambiará a "Entrevista programada".

**Marcar entrevista como pasada:** Podré registrar que la entrevista se llevó a cabo, incluyendo una nota si lo deseo. El estado del candidato deberá cambiar a "Entrevista aprobada".

**Ofertar trabajo:** Podré realizar una oferta de empleo al candidato, incluyendo una nota si lo considero necesario. El estado del candidato cambiará a "Puesto ofertado".

**Contratar candidato:** Podré finalizar el proceso de contratación, incluyendo una nota si lo deseo. El estado del candidato deberá cambiar a "Contratado". Además, los datos del candidato en el sistema deben coincidir con los ingresados previamente en los formularios.

## Información General 🔬

| N°  | Item              |       Detalle |
|:---:|:------------------|--------------:|
|  1  | Java              |       11.0.15 |
|  2  | Gradle            |         7.4.2 |
|  3  | Navegador         | Google Chrome |
|  4  | Sistema Operativo |  Ubuntu 22.04 |
|  5  | Rama principal    |          main |

## Pre requisitos para ejecutar 📋

- Java: versión 1.8 o superior (variables de entorno configuradas).
- Entorno de desarrollo: Eclipse IDE o IntelliJ IDEA
- Gradle versión 7.0 o superior (variables de entorno configuradas).
- Plugin de Cucumber para Java
- Gherkin Plugin

## Ejecutar pruebas y ver informe 🔨 👀

La herramienta de compilación de código y administrador de dependencias para este proyecto es **Gradle**, así que pare
ejecutar las pruebas use el siguiente comando en la raíz del proyecto.

``` shell 
gradle aggregate 
```

Si desea ejecutar algún Runner especifico puede usar el siguiente comando, por ejemplo, para un corredor de pruebas de
un Login.

``` shell 
gradle clean test --tests "LoginRunner"
```

## Obtener el código

El código de la automatización está alojado en un repositorio de GitHub, para hacer uso de él puede clonarlo usando Git
o descargar el archivo zip del proyecto.

Git:

``` shell 
 git clone https://github.com/wilder16/auto-orangehrmlive.git
 cd auto-orangehrmlive.git
```

## Construido con 🛠

La automatización fue desarrollada con:

- Serenity BDD - Framework de código abierto para escribir pruebas de aceptación automatizadas
- Cucumber - Herramienta de software que apoya el BDD
- Screenplay - Patrón de diseño de pruebas
- Gradle - Administrador de dependencias del proyecto
- Selenium Web Driver - Framework para interaccionar con navegadores web
- Gherkin - Lenguaje DSL de lectura empresarial (lenguaje específico de dominio)

## Versionamiento 📌

Se usa Git para el control de versiones. 🔀

## Autor Wilder de Jesus Bernal Lopez