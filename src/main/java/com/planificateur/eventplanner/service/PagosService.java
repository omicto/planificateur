package com.planificateur.eventplanner.service;

import com.planificateur.eventplanner.models.Pago;
import com.planificateur.eventplanner.repository.PagoRepository;
import com.planificateur.eventplanner.repository.ReservacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;


// FIXME Los pagos no tienen ID long solamente, incluyen num de pagos !!!!!
//       como parte de la PK
@Service
public class PagosService {
    @Autowired
    DataSource dataSource; // Recordemos que el DataSource ya está en el contenedor de Spring boot



    @Autowired
    PagoRepository pagoRepository;
    @Autowired
    ReservacionRepository reservacionRepository;

    public List<Pago> findAll(){
        return pagoRepository.findAll();
    }

    public List<Pago> findByFolioReservacion(Long folio){
        return pagoRepository.findByFolioReservacion(folio);
    }

    public Pago getOne(Long id){
        return pagoRepository.getOne(id);
    }

    public void save(Long folioReservacion, Float montoAPagar) throws IOException {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("pagos_insert");
        Float total = reservacionRepository.getOne(folioReservacion).getCostoTotal();
        if(montoAPagar.compareTo(total) > 0) throw new IOException("Monto a pagr no puede exceder el total");

        Timestamp today = Timestamp.from(Instant.now());

        SqlParameterSource inputs = new MapSqlParameterSource()
                .addValue("folio", folioReservacion)
                .addValue("montopagado",montoAPagar)
                .addValue("fecha", today);

        jdbcCall.execute(inputs);

    }

    public void deleteById(Long id){
        pagoRepository.deleteById(id);
    }
}
