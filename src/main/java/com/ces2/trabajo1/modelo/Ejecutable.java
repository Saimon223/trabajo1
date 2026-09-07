package com.ces2.trabajo1.modelo;

/**
 * Segunda interfaz de la jerarquía.
 * Hereda de Planificable (por eso ya trae planificar()) y agrega ejecutar().
 */
public interface Ejecutable extends Planificable {
    String ejecutar();
}
