package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.Album;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class AlbumDaoImpl implements IAlbumDao{
    @Override
    public void addAlbum(Album album) {
        System.out.println(LocalDateTime.now() + "：生产了一碟唱片 " + album);
    }
}
