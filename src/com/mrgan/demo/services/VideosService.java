package com.mrgan.demo.services;

import com.mrgan.demo.dao.video.VideosDAO;

public class VideosService {
	private VideosDAO videosDao;

	public int videosCount() {
		return videosDao.getAllVideos().size();
	}

	public VideosDAO getVideosDao() {
		return videosDao;
	}

	public void setVideosDao(VideosDAO userDao) {
		this.videosDao = userDao;
	}

}
