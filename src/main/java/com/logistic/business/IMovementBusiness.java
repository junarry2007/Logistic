package com.logistic.business;

import com.logistic.dto.DefaultResponseDto;
import com.logistic.dto.MovemenDto;

public interface IMovementBusiness {
    DefaultResponseDto<String> CreateMovement(MovemenDto data);
}