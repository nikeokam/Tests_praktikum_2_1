package com.company.Depository;

import com.company.Events.KoordWeatherEvent;
import com.company.Request;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KoordWeatherDepositoryTest {
    private Request request;
    private KoordWeatherDepository depository;

    @BeforeEach
    void setupTests(){
        request = new Request("Tallinn", "EE", "metric");
        depository = new KoordWeatherDepository();
    }

    @Test
    void test_getKoordWeather_exceptionThrowingNull() {

        try {
            assertNotNull(depository.getKoordWeather(request));
        } catch (Exception e) {
            fail("Failure cause: " + e.getMessage());
        }
    }

}