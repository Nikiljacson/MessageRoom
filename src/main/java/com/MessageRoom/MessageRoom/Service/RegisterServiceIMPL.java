package com.MessageRoom.MessageRoom.Service;

import com.MessageRoom.MessageRoom.DTO.RegisterDTO;
import com.MessageRoom.MessageRoom.DTO.UserDetailDTO;
import com.MessageRoom.MessageRoom.Entity.UserRegister;
import com.MessageRoom.MessageRoom.Repo.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegisterServiceIMPL implements RegisterService{

    @Autowired
    private RegisterRepo regRepo;

    @Override
    public String saveData(RegisterDTO registerDTO) {
        UserRegister userReg = new UserRegister(
                registerDTO.getUsername(),
                registerDTO.getPassword()
        );
        regRepo.save(userReg);
        return userReg.getUsername();
    }

    @Override
    public List<UserDetailDTO> getDetails() {
        List<UserRegister> getDetails = regRepo.findAll();
        List<UserDetailDTO> userDetailDTOList = new ArrayList<>();
        for(UserRegister a:getDetails){
            UserDetailDTO user = new UserDetailDTO(
                    a.getUserid(),
                    a.getUsername(),
                    a.getPassword()
            );
            userDetailDTOList.add(user);
        }
        return userDetailDTOList;
    }
}
