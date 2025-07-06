package com.ganbook.ganbookBackend.service;

import com.ganbook.ganbookBackend.model.Song;
import org.springframework.stereotype.Service;

public interface ManageSongs {
    public boolean downloadAndAddSong(Song song);
    public boolean downloadAndAddSong(String songURL);
}
