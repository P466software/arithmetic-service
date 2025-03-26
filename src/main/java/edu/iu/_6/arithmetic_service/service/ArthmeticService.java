package edu.iu._6.arithmetic_service.service;

import org.springframework.stereotype.Service;

@Service
public class ArthmeticService implements IAirthmeticService {

    @Override
    public int addNumbs(long n, long m) {
        return (int) (n + m);
    }
}
