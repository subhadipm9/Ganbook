package com.ganbook.ganbookBackend.controller;

import com.ganbook.ganbookBackend.service.ManageSongs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/test")
public class testController {
    @Autowired
   private ManageSongs manageSongs;
    @GetMapping(value = "/numbers")
    public ResponseEntity<String> testRender(){
        System.out.println("1");
        return new ResponseEntity<> ("Checked", HttpStatus.OK);
    }
    @GetMapping("/download")
    public ResponseEntity<String> downloadSong(@RequestParam String url) {
        boolean isDownloaded = manageSongs.downloadAndAddSong(url);
        if (isDownloaded) {
            return ResponseEntity.ok("Download started for: " + url);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The URL can't be found");
    }
}
