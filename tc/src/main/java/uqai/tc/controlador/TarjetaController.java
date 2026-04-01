package uqai.tc.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uqai.tc.excepcion.RecursoNoEncontrado;
import uqai.tc.modelo.TarjetaCredito;
import uqai.tc.servicio.ITarjetaService;
import uqai.tc.servicio.TarjetaService;

import java.util.List;


@RestController
@RequestMapping("tarjeta-app")
@CrossOrigin(value = "http://localhost:3000")
public class TarjetaController {

    private static final Logger logger = LoggerFactory.getLogger(TarjetaController.class);
    @Autowired
    private ITarjetaService tarjetaService;

    @GetMapping("/tarjetas")
    public List<TarjetaCredito> listarTarjetas(){
        var tarjetas = tarjetaService.listarTarjeta();
        tarjetas.forEach(tarjetaCredito -> logger.info(tarjetaCredito.toString()));
        return tarjetas;
    }
    @PostMapping("/tarjetas")
    public TarjetaCredito agregarTarjeta(@RequestBody TarjetaCredito tarjetaCredito){
        return tarjetaService.crearTarjeta(tarjetaCredito);
    }

    @GetMapping("/tarjetas/buscar")
    public ResponseEntity<TarjetaCredito> obtenerTarjetaPorNumero(@RequestParam String numeroTarjeta){

        TarjetaCredito tarjetaCredito = tarjetaService.buscarTarjetaPorNumero(numeroTarjeta);

        if(tarjetaCredito == null)
            throw new RecursoNoEncontrado("tarjeta no encontrada");
        return ResponseEntity.ok(tarjetaCredito);
    }


}
