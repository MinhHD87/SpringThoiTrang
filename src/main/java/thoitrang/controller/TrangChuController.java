package thoitrang.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thoitrang.entity.NhanVien;

@Controller
@RequestMapping("/")
public class TrangChuController {

	@Autowired
	SessionFactory sessionFactory;

	@GetMapping

	@Transactional

	public String Default() {

		Session session = sessionFactory.getCurrentSession();
		/*
		 * NhanVien nobita = new NhanVien("nobita", 30, "hn"); NhanVien xuka = new
		 * NhanVien("xuka", 28, "hn"); session.save(nobita); session.save(xuka);
		 */
		
		
		return "trangchu";
	}
	@PostMapping
	@Transactional
public String themnhanvien(@RequestParam String tenNhanVien,@RequestParam int tuoi) {

		Session session = sessionFactory.getCurrentSession();
		NhanVien nhanVien = new NhanVien(tenNhanVien,tuoi);
		session.save(nhanVien);
		
		
		return "trangchu";
		
	}
	
}
