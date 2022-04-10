//package com.ensah.core.services.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.ensah.core.bo.Coordination;
//import com.ensah.core.bo.Filiere;
//import com.ensah.core.dao.ICoordinationDao;
//import com.ensah.core.services.IFiliereService;
//import com.ensah.core.services.ICoordinationService;
//
//public class CoordinationServiceImpl implements ICoordinationService {
//	
//	@Autowired
//	private ICoordinationDao coordinationDao;
//	
//	@Autowired 
//	private IFiliereService FilierService;
//	
//	public void updateCoordination(Coordination cCoordination)
//	{
//	}
//
////	public List<Niveau> getAllNiveau();
//
//	public List<Coordination> getAllCoordination2()
//	{
//		return coordinationDao.getAll();
//	}
//	
//	public void deleteCoordination(Long id)
//	{
//		coordinationDao.delete(id);
//	}
//
//	public Coordination getCoordinationById(Long id)
//	{
//		return coordinationDao.findById(id);
//	}
//
//	public void addCoordination2( Coordination coordination, Long idFiliere)
//	{
//		Filiere f = FilierService.getFiliereById(idFiliere);
//		coordination.setFiliere(f);
//		f.getCoordination().add(coordination);
//		coordinationDao.create(coordination);
//	}
//	
//	public void updateCoordination2(Coordination coordination, Long idFiliere)
//	{
//		Filiere f = FilierService.getFiliereById(idFiliere);
//		coordination.setFiliere(f);
//		f.getCoordination().add(coordination);
//		coordinationDao.update(coordination);
//	}
//
//}
