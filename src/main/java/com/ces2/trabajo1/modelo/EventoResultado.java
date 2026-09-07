package com.ces2.trabajo1.modelo;

/**
 * Record simple para transportar, hacia la vista, el resultado de invocar
 * los tres métodos polimórficos sobre cada objeto.
 */
public record EventoResultado(String tipo, String planificar, String ejecutar, String cerrar) {
}
