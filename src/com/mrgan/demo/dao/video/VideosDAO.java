package com.mrgan.demo.dao.video;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mrgan.demo.entities.video.Videos;

public class VideosDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public List<Videos> getAllVideos() {
		String hsql = "select top 100 from Videos";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hsql);

		return query.list();
	}

}
