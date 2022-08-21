package com.woniu.w1d2springiocannotation.service.impl;

import com.woniu.w1d2springiocannotation.dao.IAlbumDao;
import com.woniu.w1d2springiocannotation.entity.Album;
import com.woniu.w1d2springiocannotation.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements IAlbumService {
    @Autowired
    private IAlbumDao albumDao;
    @Override
    public void addAlbum(Album album){
        albumDao.addAlbum(album);
    }
}
