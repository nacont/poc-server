package com.fakeserver.test.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class FakeServerServiceImpl implements IFakeServerService{

    @Override
    public ResponseEntity<?> postFaker() {
        return fakeResponse("faking *POST* endpoint", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> getFaker() {
        return fakeResponse("faking *GET* endpoint", HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<?> putFaker() {
        return fakeResponse("faking *PUT* endpoint", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> deleteFaker() {
        return fakeResponse("faking *DELETE* endpoint", HttpStatus.NO_CONTENT);
    }

    private ResponseEntity<?> fakeResponse(String responseString, HttpStatus httpStatus) {
        try {
            Thread.sleep(3000);
            return new ResponseEntity<>(responseString, httpStatus);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
