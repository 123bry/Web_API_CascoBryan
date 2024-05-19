# Web_API_CascoBryan
## Directorios principales:
- src/main/java: Este directorio contiene las clases Java del proyecto. Las clases se organizan en paquetes, que se representan por subdirectorios. Por ejemplo, las clases del paquete com.tuuniversidad.apirest.libro se encuentran en el subdirectorio com/tuuniversidad/apirest/libro.
- src/test/java: Este directorio contiene las clases de prueba del proyecto. Las clases de prueba se organizan en paquetes de la misma manera que las clases Java.
- resources: Este directorio contiene los recursos estáticos del proyecto, como archivos de configuración, imágenes y archivos HTML.
- target: Este directorio contiene los archivos compilados del proyecto.

![image](https://github.com/123bry/Web_API_CascoBryan/assets/99741524/60ba78a4-47ae-4194-bc97-fab4b08159b0)

## Funcionalidades

- Obtener todos los libros: accesible a través del punto final GET /books. Devuelve una lista de todos los libros almacenados en la base de datos de simulación.

- Obtener libros por su ID: accesible a través del punto final GET /books/{book_id} donde {book_id} es el ID del libro deseado. Devuelve información de un libro específico según su ID.

- Crear un libro nuevo: accesible a través del punto final POST /books. Le permite agregar nuevos libros a la base de datos de simulación.

## Solicitud

- Controlador (LibroController): Responsable de manejar solicitudes HTTP y llamar a servicios relacionados.
- Repositorio (LibroRepository y LibroRepositoryImpl): Define métodos para acceder a bases de datos simuladas de libros y proporciona implementaciones con datos grabados para realizar pruebas.

![image](https://github.com/123bry/Web_API_CascoBryan/assets/99741524/c1e5b752-6f31-45d7-8dda-017fd81bfb89) 
![image](https://github.com/123bry/Web_API_CascoBryan/assets/99741524/622dfee7-1fd0-4057-a563-18c892eb5eca)
![image](https://github.com/123bry/Web_API_CascoBryan/assets/99741524/631f8828-4a26-460d-9f75-aa5466e721c7)


## Ejecución

La aplicación se ejecuta en el puerto 8295 según lo configurado en application.properties. Se puede iniciar como una aplicación Spring Boot estándar ejecutando la clase principal LibroApplication. 
![image](https://github.com/123bry/Web_API_CascoBryan/assets/99741524/58799288-168f-4ebd-9e48-c18cf7442cf1)


## Pruebas en Postman
![image](https://github.com/123bry/Web_API_CascoBryan/assets/99741524/ddaf161a-5ad4-47d4-bcc1-008913bf799b)


