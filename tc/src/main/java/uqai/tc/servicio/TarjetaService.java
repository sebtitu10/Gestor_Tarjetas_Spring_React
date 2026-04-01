package uqai.tc.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uqai.tc.modelo.TarjetaCredito;
import uqai.tc.repositorio.ITarjetaRepositorio;

import java.util.List;

@Service
public class TarjetaService implements ITarjetaService {


    @Autowired
    private ITarjetaRepositorio tarjetaR;

    @Override
    public List<TarjetaCredito> listarTarjeta() {
        return tarjetaR.findAll();
    }

    @Override
    public TarjetaCredito crearTarjeta(TarjetaCredito tarjeta) {
        return tarjetaR.save(tarjeta);

    }

    @Override
    public TarjetaCredito buscarTarjetaPorNumero(String numeroTarjeta) {
         TarjetaCredito tarjetaCredito = tarjetaR.findByNumeroTarjeta(numeroTarjeta);
         return tarjetaCredito;

    }
}
