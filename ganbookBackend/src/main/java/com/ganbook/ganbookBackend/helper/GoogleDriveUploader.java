package com.ganbook.ganbookBackend.helper;


import com.fasterxml.jackson.core.JsonFactory;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import org.apache.http.auth.Credentials;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.json.jackson2.JacksonFactory;

import javax.imageio.spi.IIORegistry;
import java.io.*;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
@Deprecated
public class GoogleDriveUploader {
    public String authenticateToGoogleDrive() throws IOException, GeneralSecurityException {
        var credentials = GoogleCredential.fromStream(new FileInputStream("credentials.json"))
        .createScoped(Collections.singleton("https://www.googleapis.com/auth/drive"));

//        var driveService = new Drive.Builder(GoogleNetHttpTransport.newTrustedTransport(), JacksonFactory.grt);
        return null;
    }
}

