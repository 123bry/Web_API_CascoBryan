package com.tuuniversidad.apirest.libro.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import com.tuuniversidad.apirest.libro.modelos.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository {
        private List<Libro> libros = new ArrayList<>();
    

        public LibroRepositoryImpl(){
            libros.add(new Libro(1, "Cien años de soledad", "Gabriel Garcia Marquez", "Sudamericana"));
            libros.add(new Libro(2, "El retrato de Dorian Gray", "Oscar Wilde", "Alianza"));
            libros.add(new Libro(3, "El principito", "Antoine de Saint", "Gran travesia"));
          
            
        }

        public Libro getLibro(Long id){
            for (Libro libro: libros){
                if(id == libro.getId())
                return libro;
            }
            return null;
        }

        public List<Libro> getLibros()
        {
            return libros;
        }

        @Override
        public List<Libro> getLibros(Long id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getLibros'");
        }

        @Override
        public Libro crearLibro(Libro nuevoLibro) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'crearLibro'");
        }


}
