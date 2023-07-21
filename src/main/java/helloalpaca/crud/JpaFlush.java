package helloalpaca.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaFlush {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            /*Member member = em.find(Member.class, 150L);
            member.setName("ZZZZZ");*/

            /* Flush
            Member member = new Member(200L, "member200");
            em.persist(member);

            em.flush();*/

            /* 준 영속 상태
            Member member = em.find(Member.class, 150L);
            member.setName("AAAAA");

            em.detach(member); //나중에 commit해도 member 내용 변경된 부분 반영 안됨. 준영속상태
            System.out.println("====================");
            */

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
