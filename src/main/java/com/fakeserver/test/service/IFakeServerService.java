package com.fakeserver.test.service;

import org.springframework.http.ResponseEntity;

public interface IFakeServerService {

    public ResponseEntity<?> postFaker();
    public ResponseEntity<?> getFaker();
    public ResponseEntity<?> putFaker();
    public ResponseEntity<?> deleteFaker();
}
