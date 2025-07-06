package com.ganbook.ganbookBackend.service;

import com.ganbook.ganbookBackend.model.Song;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
public class ManageSongsImpl implements ManageSongs{
    @Override
    public boolean downloadAndAddSong(Song song) {
        return false;
    }

    @Override
    public boolean downloadAndAddSong(String songURL) {
        try{
            String ytDlpPath = "C:\\Users\\subha\\Downloads\\ganbookBackend\\ganbookBackend\\yt-dlp.exe";
            // Define output directory and filename format
            String outputDir = "downloads/%(title)s.%(ext)s";

            // Build yt-dlp command
            ProcessBuilder processBuilder = new ProcessBuilder(
                    ytDlpPath,
                    "-f", "bestaudio",
                    "--extract-audio",
                    "--audio-format", "mp3",
                    "-o", outputDir,
                    songURL
            );

            // Redirect error stream to output stream
            processBuilder.redirectErrorStream(true);

            // Start the process
            Process process = processBuilder.start();

            // Read output
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream())
            );

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for process to finish
            int exitCode = process.waitFor();
            System.out.println("Download completed with exit code: " + exitCode);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
