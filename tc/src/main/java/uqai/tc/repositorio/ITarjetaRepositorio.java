package uqai.tc.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import uqai.tc.modelo.TarjetaCredito;

public interface ITarjetaRepositorio extends JpaRepository<TarjetaCredito, Long> {
    TarjetaCredito findByNumeroTarjeta(String numeroTarjeta);
}
