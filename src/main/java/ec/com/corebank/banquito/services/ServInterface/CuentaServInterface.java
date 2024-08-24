package ec.com.corebank.banquito.services.ServInterface;

import java.util.List;
import java.util.Optional;

import ec.com.corebank.banquito.models.DTO.CuentaDTO;
import ec.com.corebank.banquito.models.entities.Cuenta;

public interface CuentaServInterface {


    List<CuentaDTO> findAll();

    Optional<CuentaDTO> findByNCuenta( Cuenta cuenta);
    
    CuentaDTO saveCuenta ( Cuenta cuenta);

    Optional<CuentaDTO> updateCuenta(Cuenta cuenta, String numeroCuenta);

    void removeCuenta(String numeroCuenta );
}
