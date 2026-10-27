package org.wadajo;

public value record Libro(Long id,
                          String autor,
                          String titulo,
                          Integer ejemplar) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return id.equals(libro.id) && ejemplar.equals(libro.ejemplar);
    }
}
