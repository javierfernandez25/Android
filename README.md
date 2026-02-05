# Fernandez Felipe Javier (Android App)

Proyecto de aplicación Android nativa desarrollado en Kotlin que demuestra una navegación fluida entre múltiples actividades y el paso de datos mediante Intents.

## Descripción

Esta aplicación sirve como una demostración práctica de los componentes fundamentales de Android. Implementa un flujo de usuario completo que comienza con una pantalla de inicio de sesión, navega a un menú principal y permite el acceso a pantallas de información, contacto y localización.

## Características

*   **Inicio de Sesión (Login):**
    *   Validación básica de campos (usuario y contraseña no vacíos).
    *   Navegación segura a la actividad principal tras un inicio de sesión exitoso.
*   **Gestión de Navegación:**
    *   Transiciones fluidas entre 5 actividades distintas: `LoginActivity`, `InicioActivity`, `ContactoActivity`, `SobreNosotrosActivity`, y `LocalizacionActivity`.
*   **Paso de Datos:**
    *   Demostración del uso de `Intents` para enviar información (como el nombre de usuario) de una actividad a otra.
*   **UI Moderna:**
    *   Uso de **ViewBinding** para una interacción eficiente y segura con las vistas XML, eliminando la necesidad de `findViewById`.

## Tecnologías Utilizadas

*   **Lenguaje:** Kotlin
*   **SDK:** Android SDK
*   **Diseño:** XML Layouts
*   **Arquitectura:** MVC (Model-View-Controller) patrón estándar de actividades

## Instrucciones de Instalación y Uso

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/javierfernandez25/Android
    ```
2.  **Abrir en Android Studio:**
    *   Inicia Android Studio.
    *   Selecciona "Open an Existing Project".
    *   Navega hasta la carpeta clonada y selecciónala.
3.  **Compilar y Ejecutar:**
    *   Espera a que Gradle sincronice las dependencias.
    *   Selecciona un emulador o conecta tu dispositivo físico.
    *   Haz clic en el botón **Run** (triángulo verde).
