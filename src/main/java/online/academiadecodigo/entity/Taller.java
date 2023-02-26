package online.academiadecodigo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="TBL_TALLERES")
@Entity(name="Taller")
public class Taller {
	
	private Long id;
	private String nombre;
	private String resumen;
	private TipoPagoEnum tipoPago;
	private LocalDate fecha;
	private LocalTime hora;
}
