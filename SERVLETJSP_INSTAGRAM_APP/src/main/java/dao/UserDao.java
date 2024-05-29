package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import antlr.collections.List;
import dto.UserDto;

public class UserDao {
   EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
   EntityManager em=emf.createEntityManager();
   EntityTransaction et=em.getTransaction();
   
   public void save(UserDto userDto) {
	   et.begin();
	   em.persist(userDto);
	   et.commit();
   }
   public UserDto getUserNamePassword(String name,String password) {
Query query=em.createQuery("select t from UserDto t where userName=?1 and userPassword=?2");
	   query.setParameter(1,name);
	   query.setParameter(2,password);
	   UserDto userDto=null;
	   try {
		   userDto=(UserDto) query.getSingleResult();
		} catch (Exception e) {
			userDto=null;
		}
		   if (userDto!=null) {
			   return userDto;
				} else {
					return null;
	}
   }
   public java.util.List<UserDto> getAllUsers() {
	   Query query=em.createQuery("select t from UserDto t");
	   java.util.List<UserDto> userDtoList=query.getResultList();
	   return userDtoList; 
   }
   public void deleteUser(int id) {
	   et.begin();
	   UserDto userDto=em.find(UserDto.class,id);
	   em.remove(userDto);
	   et.commit();
   }
   public UserDto getById(int id) {
	   UserDto userDto=em.find(UserDto.class,id);
	   return userDto;
   }
   public void update(UserDto userDto) {
	   et.begin();
	   em.merge(userDto);
	   et.commit();
   }
}
