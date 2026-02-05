# Actividad Android - Fernandez Felipe Javier

Este proyecto cumple estrictamente con los requisitos de la actividad de desarrollo de aplicaciones móviles.

## Requisitos Implementados

1.  **Activity 1: Login**
    *   Formulario con dos campos: **Usuario** y **Contraseña**.
    *   Botón de **"Login"** que valida que los campos no estén vacíos.
    *   Navegación a la **Activity 2 (Inicio)**, pasando el nombre de usuario como valor mediante un Intent.
    *   Uso de `inflate` (ViewBinding) para cargar el layout.

2.  **Activity 2: Inicio**
    *   Muestra un mensaje de bienvenida con el **nombre de usuario** recibido desde la Activity 1.
    *   Tres botones para navegar a las siguientes actividades:
        *   **Contacto**
        *   **Sobre Nosotros**
        *   **Localización**
    *   Uso de `inflate` para cargar el layout en lugar de `setContentView(R.layout...)`.

3.  **Activity 3: Contacto**
    *   Formulario con campos: **Nombre**, **Email**, y **Mensaje**.
    *   Botón de **"Enviar"**. Al hacer clic, los datos se envían de vuelta a la **Activity 2 (Inicio)**.
    *   En la Activity 2, se muestran los datos recibidos en un TextView.
    *   Implementación de `inflate` para cargar el diseño.

4.  **Activity 4: Sobre Nosotros**
    *   Pantalla sencilla con información estática sobre la aplicación/equipo.
    *   Carga del layout usando `inflate`.

5.  **Activity 5: Localización**
    *   Pantalla que incluye un mensaje estático y una simulación de mapa/ubicación.
    *   Carga del layout usando `inflate`.

## Instalación

```bash
git clone https://github.com/javierfernandez25/Android
```
