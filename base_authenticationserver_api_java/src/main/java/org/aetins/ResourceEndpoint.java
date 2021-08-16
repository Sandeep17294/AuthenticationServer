package org.aetins;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: Default title to Change.
 * <p>
 * Created by sandeep on 2017/10/20
 */
@RestController
@RequestMapping("/resource")
public class ResourceEndpoint {
    @GetMapping
    public ResponseEntity<String> resource() {
        return ResponseEntity.ok("CORS Resource testing protected by spring-security.");
    }
}
