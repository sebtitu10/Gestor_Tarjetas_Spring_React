package uqai.tc.modelo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TarjetaCredito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero_tarjeta", nullable = false, unique = true, length = 20)
    private String numeroTarjeta;

    @Column(nullable = false)
    private String titular;

    @Column(name = "limite_credito", nullable = false)
    private Double limiteCredito;

    @Column(name = "saldo_disponible", nullable = false)
    private Double saldoDisponible;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoTarjeta estado;
}
