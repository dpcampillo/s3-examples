package com.developer.aws.s3example.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;

@RestController
@RequestMapping("/download")
public class DownloadController {

    @CrossOrigin
    @GetMapping("/pdf")
    public ResponseEntity<InputStreamResource> downloadPdf() throws IOException {
        String urlString = "http://es.tldp.org/COMO-INSFLUG/es/pdf/Linuxdoc-Ejemplo.pdf";
        URL url = new URL(urlString);
        InputStreamResource inputStreamResource = new InputStreamResource(url.openStream());
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .body(inputStreamResource);
    }

}
