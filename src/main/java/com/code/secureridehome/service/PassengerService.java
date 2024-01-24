package com.code.secureridehome.service;

import com.code.secureridehome.mapper.PassengerMapper;
import com.code.secureridehome.model.entity.Passenger;
import com.code.secureridehome.model.request.PassengerRegister;
import com.code.secureridehome.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class PassengerService {
    private final PassengerRepository _repo;
    private final PassengerMapper _mapper;
@Autowired
    public PassengerService(PassengerRepository repo, PassengerMapper mapper){
    _repo=repo;
    _mapper=mapper;
}
public void registerPassenger(PassengerRegister register){
    Passenger passenger=_mapper.mapRequestToEntity(register);
    passenger.setCreateAt(LocalDateTime.now());
    passenger.setFlag(Byte.valueOf("0"));
    _repo.save(passenger);
}
public List<Passenger> getAll(){
    return _repo.findAll();
}
}
