package com.logistic.business;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistic.dto.DefaultResponseDto;
import com.logistic.dto.MovemenDto;
import com.logistic.entity.MovementsEntity;
import com.logistic.entity.PortEntity;
import com.logistic.entity.ProductsTypeEntity;
import com.logistic.entity.StoreEntity;
import com.logistic.service.IMovementsService;
import com.logistic.service.IPortService;
import com.logistic.service.IProductTypeService;
import com.logistic.service.IStoreService;

@Service
public class MovementBusiness implements IMovementBusiness {

    @Autowired
    IProductTypeService productTypeService;

    @Autowired
    IPortService portService;

    @Autowired
    IStoreService storeService;

    @Autowired
    IMovementsService movementsService;
    
    public DefaultResponseDto<String> CreateMovement(MovemenDto data){
        DefaultResponseDto<String> response = new DefaultResponseDto<String>(
            true,
            "0x000",
            "OK",
            "El movimiento logistico se inserto correctamente"
        );
        MovementsEntity movement = new MovementsEntity();
        try{
            if(data.getProcessType().equals(1)){
                //-- Logistica Terrestre
                if(data.getVehicleId().equals("")){
                    response.setStatus(false);
                    response.setCodeStatus("0x001");
                    response.setMessage("La placa del vehiculo no puede ser nula");
                    return response;
                }

                if(data.getVehicleId().length() != 6){
                    response.setStatus(false);
                    response.setCodeStatus("0x002");
                    response.setMessage("La placa del vehiculo es incorrecta");
                    return response;
                }

                if(!onlyAlphabets(data.getVehicleId().substring(0, 2), 3)){
                    response.setStatus(false);
                    response.setCodeStatus("0x003");
                    response.setMessage("La placa del vehiculo debe contener 3 letras inicialmente");
                    return response;
                }

                if(onlyAlphabets(data.getVehicleId().substring(3, 5), 3)){
                    response.setStatus(false);
                    response.setCodeStatus("0x004");
                    response.setMessage("La placa del vehiculo debe contener 3 numero al final");
                    return response;
                }

                //-- Validacion de descuento
                if(data.getQuantity() > 10){
                    BigDecimal disc = new BigDecimal("5.0");
                    movement.setDiscountRate(disc);
                }

                Optional<StoreEntity> storeEntity = storeService.getById(data.getPortId());
                if(storeEntity == null){
                    response.setStatus(false);
                    response.setCodeStatus("0x011");
                    response.setMessage("Ocurrio un error al consultar la bodega");
                    return response;
                }
                movement.setStore(storeEntity.get());
                movement.setVehicleId(data.getVehicleId());

            }else{
                //-- Logistica Maritima
                if(data.getFleetNumber().length() != 8){
                    response.setStatus(false);
                    response.setCodeStatus("0x005");
                    response.setMessage("El numero de flota es incorrecto");
                    return response;
                }

                if(!onlyAlphabets(data.getFleetNumber().substring(0,2), 3)){
                    response.setStatus(false);
                    response.setCodeStatus("0x006");
                    response.setMessage("El numero de flota debe contener 3 letras inicialmente");
                    return response;
                }

                if(onlyAlphabets(data.getFleetNumber().substring(3,5), 3)){
                    response.setStatus(false);
                    response.setCodeStatus("0x007");
                    response.setMessage("El numero de flota debe contener 3 numeros despues de las 3 letras iniciales");
                    return response;
                }

                if(onlyAlphabets(data.getFleetNumber().substring((data.getFleetNumber().length() - 1),data.getFleetNumber().length()), 1)){
                    response.setStatus(false);
                    response.setCodeStatus("0x008");
                    response.setMessage("El numero de flota debe finalizar con una letra");
                    return response;
                }

                //-- Validacion de descuento
                if(data.getQuantity() > 10){
                    BigDecimal disc = new BigDecimal("3.0");
                    movement.setDiscountRate(disc);
                }

                Optional<PortEntity> portEntiy = portService.getById(data.getPortId());
                if(portEntiy == null){
                    response.setStatus(false);
                    response.setCodeStatus("0x011");
                    response.setMessage("Ocurrio un error al consultar el puerto");
                    return response;
                }
                movement.setPortId(portEntiy.get());
                movement.setFleetNumber(data.getFleetNumber());
            }

            if(data.getQuantity() > 10){
                BigDecimal por = new BigDecimal("100");
                BigDecimal mul = new BigDecimal("10");
                BigDecimal sp = new BigDecimal(data.getShippingPrice());
                movement.setShippingPriceDiscount(sp.multiply(movement.getDiscountRate().divide(por)));
                movement.setShippingTotal((sp.subtract(movement.getShippingPriceDiscount())).multiply(mul).divide(mul));
            }

            if(data.getGuideNumber().length() < 9){
                response.setStatus(false);
                response.setCodeStatus("0x009");
                response.setMessage("El numero de guia es incorrecto");
                return response;
            }

            Optional<ProductsTypeEntity> productType = productTypeService.getById(data.getProductTypeId());
            if(productType == null){
                response.setStatus(false);
                response.setCodeStatus("0x010");
                response.setMessage("Ocurrio un error al consultar el tipo de producto");
                return response;
            }
            movement.setProductTypeId(productType.get());
            movement.setProductQuantity(data.getQuantity());
            movement.setRegistrationDate(Date.from(Instant.now()));
            movement.setDeliveryDate(data.getDeliveryDate());
            movement.setShippingPrice(new BigDecimal(data.getShippingPrice()));
            movement.setProcessType(data.getProcessType());
            movement.setClientName(data.getClientName());
            movement.setClientIdentification(data.getClientIdentification());

            movementsService.insert(movement);
            
            return response;
        }catch(Exception ex){
            response.setStatus(false);
            response.setCodeStatus("0x999");
            response.setMessage(ex.getMessage());
            return response;
        }
    }

    private static boolean onlyAlphabets(String str, int n) {
        if (str == null || str == "") {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}