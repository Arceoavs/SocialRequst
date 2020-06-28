package com.group6.group6.service;

import org.springframework.stereotype.Service;
import com.group6.group6.model.Coordinates;

@Service
public interface TTApiService {

  public Coordinates getCoordinates (String query);
}
