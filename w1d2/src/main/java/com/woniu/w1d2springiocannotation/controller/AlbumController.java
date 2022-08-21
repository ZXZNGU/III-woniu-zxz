package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.Album;
import com.woniu.w1d2springiocannotation.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    public void addAlbum(Album album) {
        albumService.addAlbum(album);
    }
}
