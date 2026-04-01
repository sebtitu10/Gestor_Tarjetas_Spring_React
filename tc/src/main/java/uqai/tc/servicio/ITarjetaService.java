package uqai.tc.servicio;

import org.springframework.data.jpa.repository.JpaRepository;
import uqai.tc.modelo.TarjetaCredito;
import java.util.List;

public interface ITarjetaService  {
    public List<TarjetaCredito> listarTarjeta();
    public TarjetaCredito crearTarjeta(TarjetaCredito tarjeta);
    public TarjetaCredito buscarTarjetaPorNumero(String numeroTarjeta);



}
