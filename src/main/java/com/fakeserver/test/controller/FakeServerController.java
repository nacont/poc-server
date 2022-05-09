package com.fakeserver.test.controller;

import com.fakeserver.test.service.IFakeServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poc-server/")
public class FakeServerController {

    private IFakeServerService fakeServerService;

    @Autowired
    public FakeServerController(IFakeServerService fakeServerService) {
        this.fakeServerService = fakeServerService;
    }

    @PostMapping("/")
    public ResponseEntity<?> fakePost() {
        return fakeServerService.postFaker();
    }

    @GetMapping("/")
    public ResponseEntity<?> fakeGet() {
        return fakeServerService.getFaker();
    }

    @PutMapping("/")
    public ResponseEntity<?> fakePut() {
        return fakeServerService.putFaker();
    }

    @DeleteMapping("/")
    public ResponseEntity<?> fakeDelete() {
        return fakeServerService.deleteFaker();
    }
}
