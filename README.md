# Conversor de Moneda en Java

## 📌 Descripción
Este proyecto en **Java** permite la conversión de moneda utilizando datos obtenidos de una API externa. Se encarga de gestionar la solicitud a la API, procesar la información, realizar la conversión y guardar los datos en un archivo JSON para futuras consultas.

## 🚀 Características
- Obtención de tasas de conversión de moneda desde una API externa.
- Conversión de moneda en tiempo real.
- Manejo de archivos JSON para almacenamiento de datos.
- Interfaz de usuario basada en opciones en consola.
- Implementación de **HttpClient** para solicitudes a la API.
- Uso de **Gson** para el procesamiento de datos JSON.

## 🏗️ Estructura del Proyecto
El código se divide en varias clases clave:

- **Principal**: Punto de entrada del programa, gestiona el flujo de ejecución.
- **ConsultaAPI**: Se encarga de realizar solicitudes HTTP a la API de tasas de conversión.
- **CrearArchivo**: Convierte los datos obtenidos y los guarda en un archivo JSON.
- **Menu**: Presenta una interfaz de usuario basada en opciones.
- **Consulta**: Representa los datos obtenidos y proporciona métodos para acceder a la tasa de conversión.

## 📜 Requisitos
Para ejecutar este proyecto necesitas:
- **Java 17+**
- **IntelliJ IDEA** (opcional)
- **Gson** para el manejo de datos JSON
- Conexión a internet para consultar la API de tasas de conversión.

## ⚙️ Instalación y Uso
1. Clona el repositorio:
   ```sh
   git clone https://github.com/Diegith/ConversorMoneda-Java.git
