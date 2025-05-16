package com.example.backendproject.memo.domian;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemoController {


    @GetMapping("/")
    public String getString() {
        return "OK";
    }
}
