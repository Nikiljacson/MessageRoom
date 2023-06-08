package com.MessageRoom.MessageRoom.Service;

import com.MessageRoom.MessageRoom.DTO.RegisterDTO;
import com.MessageRoom.MessageRoom.DTO.UserDetailDTO;

import java.util.List;

public interface RegisterService {
    String saveData(RegisterDTO registerDTO);

    List<UserDetailDTO> getDetails();
}
